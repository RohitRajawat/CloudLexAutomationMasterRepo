package com.clxMT.Pages;
import com.clxMT.Base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoginPage extends TestBase
{
     // Page elements, OR - object repository
     @FindBy(xpath = "//label[contains(text(),'Username')]") static WebElement UsernameTitle;
     @FindBy(id = "exampleInputEmail1") static WebElement usernameTextBox;
     @FindBy(xpath = "//label[contains(text(),'Password')]") static WebElement PasswordTitle;
     @FindBy(id = "exampleInputPassword1") static WebElement passwordTextBox;
     @FindBy(xpath = "//label[contains(text(),'Keep me logged in.')]") static WebElement KeepMeLoginTitle;
     @FindBy(xpath = "//input[@type='checkbox']") static WebElement KeepMeLoginCheck;
     @FindBy(xpath = "//input[@value='LOGIN']") static WebElement loginButton;
     @FindBy(xpath = "//a[text()='Forgot Password?']") static WebElement forgotPwdLink;
     @FindBy(xpath = "//h3[contains(text(),'Reset Your CloudLe')]") static WebElement resetPasswordTitle;
     @FindBy(xpath = "//input[@type='email']") static WebElement resetPasswordTextBox;
     @FindBy(xpath = "//button[text()='Continue']") static WebElement resetPasswordSubmit;
     @FindBy(xpath = "//a[text()='Terms of Use']") static WebElement termsOfUseLink;
     @FindBy(xpath = "//h1[contains(text(),'Terms of Service')]") static WebElement termsTitle;
     @FindBy(xpath = "//a[contains(text(),'Schedule a demo!')]") static WebElement scheduleDemoLink;
     @FindBy(xpath = "//h2[contains(text(),'See the CloudLex difference')]") static WebElement scheduleDemoTitle;
     @FindBy(xpath = "(//span[text()='LaunchPad'])[1]") static WebElement LaunchpadLogo;

    //Initialization of WebElements
    public LoginPage()
     {
         PageFactory.initElements(driver,this);
     }

    // Methods for elements for Actions
     public static String validateLoginTitle()
     {
         return driver.getTitle();
     }
     public static boolean validateUsernameTitle()
     {
          return UsernameTitle.isDisplayed();
     }
     public static boolean validatePasswordTitle()
     {
          return PasswordTitle.isDisplayed();
     }
     public static boolean validateKeepMeLogin()
     {
         return KeepMeLoginTitle.isDisplayed();
     }
     public static boolean validateLoginBtn()
     {
         return loginButton.isDisplayed();
     }
     public static boolean validateForgotLink()
     {
         return forgotPwdLink.isDisplayed();
     }

     public static void checkForgotPasswordTab() throws InterruptedException, IOException {
         forgotPwdLink.click();
         String mainTab= driver.getWindowHandle();
         Set<String> allTabs= driver.getWindowHandles();
         Iterator<String> itr = allTabs.iterator();
         while (itr.hasNext())
         {
             String tab = itr.next();
             if (!mainTab.equalsIgnoreCase(tab))
             {
                 driver.switchTo().window(tab);
                 if (resetPasswordTitle.isDisplayed())
                 {
                     System.out.println("reset password title is displaying");
                 }
                 resetPasswordTextBox.sendKeys(prop.getProperty("resetUsername"));
                 Thread.sleep(1000);
                 boolean flag =resetPasswordSubmit.isEnabled();
                 Assert.assertTrue(flag);
             }
         }
         TestBase.screenshot(driver,"ForgotPasswordPage");
         driver.close();
         driver.switchTo().window(mainTab);  // this is required to switch the driver control on main tab
     }
    public static boolean validateTermsOfUseLink() throws InterruptedException
    {
        Thread.sleep(1000);
        return termsOfUseLink.isDisplayed();
    }

    public static void checkTermOfUsePage() throws InterruptedException, IOException {

        termsOfUseLink.click();
        String mainTab= driver.getWindowHandle();
        Set<String> allTabs= driver.getWindowHandles();
        List<String> tabs= new ArrayList<>(allTabs);
        driver.switchTo().window(tabs.get(1));
        String title = termsTitle.getText();
        System.out.println(title);
        Assert.assertEquals("Terms of Service",title);
        screenshot(driver,"TermsOfUse");
        driver.close();
        driver.switchTo().window(mainTab);
    }

    public static boolean validateScheduleDemoLink() throws InterruptedException {
        Thread.sleep(1000);
        return scheduleDemoLink.isDisplayed();
    }

    public static void checkScheduleDemoPage() throws IOException {
        scheduleDemoLink.click();
        String mainTab = driver.getWindowHandle();
        Set<String> allTabs = driver.getWindowHandles();
        List<String> tabs= new ArrayList<>(allTabs);
        driver.switchTo().window(tabs.get(1));
        String title= scheduleDemoTitle.getText();
        System.out.println(title);
        Assert.assertEquals("See the CloudLex difference",title);
        screenshot(driver,"ScheduleDemoPage");
        driver.close();
        driver.switchTo().window(mainTab);
    }

    public static void invalidLogin()
    {
        usernameTextBox.clear();
        usernameTextBox.sendKeys("abc@gmail.com");
        passwordTextBox.clear();
        passwordTextBox.sendKeys("1234568");

    }

    public static void submit() throws InterruptedException, IOException {
        loginButton.click();
        Thread.sleep(4000);
    }

    public static void clickKeepMeLogin()
    {
        KeepMeLoginCheck.click();
    }

     public static void validLogin() throws IOException {
         usernameTextBox.clear();
         usernameTextBox.sendKeys(prop.getProperty("username"));
         passwordTextBox.clear();
         passwordTextBox.sendKeys(prop.getProperty("password"));
         screenshot(driver,"LoginScreen");
     }

     public static boolean launchPad(){
        return LaunchpadLogo.isDisplayed();

     }

}
