package com.clxMT.Base;
import io.cucumber.java.Scenario;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

public class TestBase
{
    public static  Properties prop = new Properties();
    public static WebDriver driver;
    public static JavascriptExecutor jse = ((JavascriptExecutor)driver);

    // Method to read the Properties form configuration
   public static void readProperties() throws IOException
   {
       FileInputStream fis = new FileInputStream("src/main/java/com/clxMT/Configuration/Confic.properties");
       prop.load(fis);
   }
    // launching the browser
    public static void launchBrowser()
    {
        String br = prop.getProperty("Browser");

        if (br.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
          ChromeOptions options= new ChromeOptions();
          options.addArguments("--disable-notifications");
          driver= new ChromeDriver(options);
        }
        else if (br.equalsIgnoreCase("FF"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
            driver= new FirefoxDriver();
        }
        else if(br.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver","D:\\Selenium\\Selenium\\Drivers\\IEDriverServer.exe");
            driver= new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("ImplicitWait")), TimeUnit.MILLISECONDS);
    }
    // Navigate to the website url
    public static void  urlNavigate()
    {
        driver.get(prop.getProperty("url"));
    }

    //logout and close the browser
    public static void closeBrowser()
    {
        driver.quit();
    }

    public static void logout()
    {
        driver.findElement(By.xpath("//a[@id='dropdownMenu5']/div/img")).click();
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
    }

    // Reading the Test data from xls file.xml
    public void readTestData() throws IOException
    {
        File file = new File("src/main/java/com/clxMT/TestData/TestDataInput.xlsx");
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh= wb.getSheetAt(0);

        int numOfrows = sh.getPhysicalNumberOfRows();
        int numOfcol = sh.getRow(0).getLastCellNum();

        for (int i=1; i<=numOfrows; i++)
        {
            for (int j=0; j<numOfcol; j++)
            {
                String value = sh.getRow(i).getCell(j).getStringCellValue();
                System.out.println(value);
            }

        }
    }
    // Taking the screenshot just need to pass the name for screenshot
    public static void screenshot(WebDriver driver, String name) throws IOException
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/Screenshots/"+name+".jpg"));
    }

    // Page scroll
    public void pageScroll()
    {
        jse.executeScript("window.scrollBy(1000)");
    }
}
