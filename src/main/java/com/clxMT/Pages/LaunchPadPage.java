package com.clxMT.Pages;
import com.clxMT.Base.TestBase;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LaunchPadPage extends TestBase
{
// webElements, OR- Object repository
    @FindBy(xpath = "//label[text()='DEFAULT APPS']") static WebElement defaultAppTitle;
    @FindBy(xpath = "//span[text()='CONTACT MANAGER']") static WebElement contactManagerTile;
    @FindBy(xpath = "//span[text()='DOCUMENT MANAGER']") static WebElement documentManagerTile;
    @FindBy(xpath = "(//span[text()='REPORTS'])[2]") static WebElement reportTile;
    @FindBy(xpath=  "//span[contains(text(),'LEAD MANAGER')]") static WebElement leadManager;
    @FindBy(xpath = "(//a[text()='Workbench'])[1]") static WebElement workbenchLinkLead;
    @FindBy(linkText = "Leads") static WebElement leadLink;
    @FindBy(xpath = "//span[contains(text(),'INTAKE MANAGER')]") static WebElement intakeManager;
    @FindBy(xpath = "(//a[text()='Workbench'])[2]") static WebElement workbenchLinkIntake;
    @FindBy(linkText = "Intakes") static WebElement intakeLink;
    @FindBy(xpath = "//span[contains(text(),'CLAIM MANAGER')]") static WebElement claimManager;
    @FindBy(id = "lmi") static WebElement defaultCheckLead;
    @FindBy(id="mmi2") static WebElement defaultCheckIntake;
    @FindBy(xpath = "//button[text()='ADD NEW']") static WebElement addNewButton;
    @FindBy(xpath = "//label[text()='Add Intake']") static WebElement addLeadOption;
    @FindBy(xpath = "//a[@id='dropdownMenuNotification']") static WebElement notificationBell;
    @FindBy(xpath = "//h2[text()='Notifications']")static WebElement notificationList;
    @FindBy(xpath = "//a[@id='dropdownMenu6']") static WebElement nineSquareMenu;
    @FindBy(xpath = "//div[text()=' your subscriptions']")static WebElement nineSquareMenuOption;
    @FindBy(className = "profileImage") static WebElement profilePic;
    @FindBy(xpath = "//span[contains(text(),'Rohit Singh')]") static WebElement profileUserName;
    @FindBy(xpath = "//small[text()='Attorney']") static WebElement profileUserRole;
    @FindBy(id="nav") static WebElement sidePanel;

    // Constructor for WebElement initialization
    public LaunchPadPage()
    {
        PageFactory.initElements(driver,this);
    }

    // Action Methods for WebElements

    public static boolean validateDefaultAppTitle()
    {
        return defaultAppTitle.isDisplayed();
    }
    public static boolean validateContactManagerTile()
    {
        return contactManagerTile.isDisplayed();
    }
    public  static boolean validateDocumentManagerTile()
    {
        return documentManagerTile.isDisplayed();
    }
    public static boolean validateReportTile()
    {
        return reportTile.isDisplayed();
    }
    public static boolean validateLeadManager()
    {
        return leadManager.isDisplayed();
    }
    public static boolean validateWorkbenchLeadLink()
    {
        return workbenchLinkLead.isDisplayed();
    }
    public static boolean validateLeadsLink()
    {
        return leadLink.isDisplayed();
    }
    public  static boolean validateCheckboxLead()
    {
        return defaultCheckLead.isSelected();
    }


    public static boolean validateIntakeManager()
    {
        return intakeManager.isDisplayed();
    }
    public static boolean validateWorkbenchIntakeLink()
    {
        return workbenchLinkIntake.isDisplayed();
    }
    public static boolean validateIntakeLink()
    {
        return intakeLink.isDisplayed();
    }
    public  static boolean validateCheckboxIntake()
    {
        return defaultCheckIntake.isSelected();
    }
    public static boolean validateClaimManager()
    {
        return claimManager.isDisplayed();
    }

    public static boolean validateAddNewButton()
    {
        return addNewButton.isDisplayed();
    }

    public static void clickOnAddButton()
    {
        addNewButton.click();
    }

    public static boolean validateAddButtonOption()
    {
        return addLeadOption.isDisplayed();
    }

    public static boolean validateNotificationBell()
    {
        return notificationBell.isDisplayed();
    }

    public static void clickOnNotificationBell()
    {
        notificationBell.click();
    }
    public static boolean validateNotificationList()
    {
        return notificationList.isDisplayed();
    }

    public  static boolean validateNineSquare()
    {
        return nineSquareMenu.isDisplayed();
    }
    public static void clickOnNineSquare()
    {
        nineSquareMenu.click();
    }
    public static boolean validateNineSquareOption()
    {
        return nineSquareMenuOption.isDisplayed();
    }
    public static boolean validateProfile()
    {
        return profilePic.isDisplayed();
    }
    public static void clickOnProfile() throws IOException {
        profilePic.click();
        screenshot(driver,"UserProfile");
    }
    public static boolean validateUsername()
    {
        return profileUserName.isDisplayed();
    }
    public static boolean validateUserRole()
    {
        return profileUserRole.isDisplayed();
    }
    public static boolean validateSidePanel()
    {
        return sidePanel.isDisplayed();
    }
}
