package com.clxMT.Pages;
import com.clxMT.Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class AddLeadPage extends TestBase {

    // WebElements or Object repository
    @FindBy(xpath = "//label[text()='Add Lead']") static WebElement addLead;
    @FindBy(xpath = "(//div[@id='NaturetortDetails']/div/div/div/div/div/div/input[@type='radio'])[1]") static  WebElement campLejeuneRadio;
    @FindBy(xpath = "(//div[@id='NaturetortDetails']/div/div/div/div/div/div/input[@type='radio'])[2]") static  WebElement toyotaRadio;
    @FindBy(xpath = "(//input[@id='newLead'])[1]") static WebElement newLeadRadio;
    @FindBy(xpath = "(//input[@id='newLead'])[2]") static WebElement ExistingLeadRadio;
    @FindBy(xpath = "//input[@name='newLead']") static WebElement searchExistingLead;
    @FindBy(xpath=  "//ul[@role='listbox']/li/a") static List<WebElement> searchOptions; // for the list
    @FindBy(xpath = "//label[text()='Military']") static WebElement employmentNatureMilitary;
    @FindBy(xpath = "//label[text()='Family Member']") static WebElement employmentNatureFamily;
    @FindBy(xpath = "//span[contains(text(),'New Leads')]") static WebElement defaultStatus;
    @FindBy(xpath = "//small[@class='ng-binding ng-scope']") static List<WebElement> statusOptions; // for the list

    @FindBy(xpath = "//input[@placeholder='Title']") static WebElement titleDropdown;
    @FindBy(xpath = "//small[@class='ng-binding ng-scope']") static List<WebElement> titleOptions;
    @FindBy(xpath = "//input[@placeholder='First Name']") static WebElement personalFN;
    @FindBy(xpath = "//input[@placeholder='Middle Name']") static WebElement personalMN;
    @FindBy(xpath = "//input[@placeholder='Last Name']") static WebElement personalLN;
    @FindBy(xpath = "//input[@name='email1']") static WebElement emailId1;
    @FindBy(xpath = "//*[@id=\"PersonalDetails\"]/div[3]/div[1]/div/div/div/div/div[2]/span/a") static WebElement moreEmail;
    @FindBy(xpath = "//input[@name='email2']") static WebElement emailId2;
    @FindBy(xpath = "//input[@name='phone1']") static WebElement contactNum1;
    @FindBy(xpath = "//*[@id=\"PersonalDetails\"]/div[3]/div[2]/div/div/div/div/div[2]/span/a") static WebElement moreContact;
    @FindBy(xpath = "//input[@name='phone2']") static WebElement contactNum2;
    @FindBy(xpath = "//div[@id='PersonalDetails']/div[4]/div/div[2]/div[2]/input[@type='radio']") static WebElement claimantNo;
    @FindBy(xpath = "(//textarea[@placeholder='Add Memo...'])[1]") static WebElement memo;

    @FindBy(xpath = "//*[@id=\"IdForScrollFormBody\"]/div[2]/div[2]/div[2]/ng-include/div[4]/div[1]/div/div[2]/div[2]/input") static WebElement powerOfAttorneyNo;
    @FindBy(xpath ="//input[@name='relation_with_claimant']") static WebElement claimantRelationship;
    @FindBy(xpath = "//input[@placeholder='Claimant’s First Name']") static WebElement claimantFN;
    @FindBy(xpath = "//input[@placeholder='Claimant’s Middle Name']") static WebElement claimantMN;
    @FindBy(xpath = "//input[@placeholder='Claimant’s Last Name']") static WebElement claimantLN;
    @FindBy(xpath = "//input[@name='sub_email1']") static WebElement claimantEmailId1;
    @FindBy(xpath = "//*[@id=\"IdForScrollFormBody\"]/div[2]/div[2]/div[2]/ng-include/div[4]/div[4]/div[1]/div/div/div/div/div[2]/span/a") static WebElement claimantMoreEmail;
    @FindBy(xpath = "//input[@name='sub_email1']") static WebElement claimantEmailId2;
    @FindBy(xpath = "//*[@id=\"IdForScrollFormBody\"]/div[2]/div[2]/div[2]/ng-include/div[4]/div[4]/div[2]/div/div/div/div/div[1]/input") static WebElement claimantContactNum1;
    @FindBy(xpath = "//*[@id=\"IdForScrollFormBody\"]/div[2]/div[2]/div[2]/ng-include/div[4]/div[4]/div[2]/div/div/div/div/div[2]/span/a") static WebElement claimantMoreContact;
    @FindBy(xpath = "//*[@id=\"IdForScrollFormBody\"]/div[2]/div[2]/div[2]/ng-include/div[4]/div[4]/div[2]/div/div[2]/div/div/div[1]/input") static WebElement claimantContactNum2;

    @FindBy(xpath = "//div/h3[text()='Additional Details']") static WebElement AdditionalDetailsLink;
    @FindBy(xpath = "(//input[@type='radio'])[7]") static WebElement StayRadioYes;
    @FindBy(xpath = "(//input[@type='radio'])[8]") static WebElement StayRadioNo;
    @FindBy(xpath = "//input[@id='pdBirthDatePicker']") static WebElement claimantDoB;
    @FindBy(xpath = "//input[@placeholder='Gender']") static WebElement claimantGender;
    @FindBy(xpath = "//div[@class='option ui-select-choices-row-inner']") static List<WebElement> genderOptions;
    @FindBy(xpath = "//input[@placeholder='Marital Status']") static  WebElement maritalStatus;
    @FindBy(xpath = "//div[@class='option ui-select-choices-row-inner']") static List<WebElement> maritalStatusOptions;
    @FindBy(id = "pastSpouse1") static WebElement pastSpouseSearch;
    @FindBy(xpath = "//ul[@role='listbox']/li") static  List<WebElement> pastSpouseSearchOptions;
    @FindBy(xpath = "(//button[text()='Add New'])[1]") static WebElement addNewContact;
    @FindBy(xpath = "(//button[text()='Cancel'])[2]") static WebElement closeAddNewPopup;
    @FindBy(id = "currentSpouse") static WebElement currentSpouse;
    @FindBy(xpath = "//ul[@role='listbox']/li") static List<WebElement> currentSpouseOptions;

    @FindBy(xpath = "(//label[text()='No'])[3]/parent::div/input") static WebElement disabledNo;
    @FindBy(xpath = "(//label[text()='Yes'])[3]/parent::div/input") static WebElement disabledYes;
    @FindBy(id = "disableDatePicker") static WebElement dateOfdisablity;

    @FindBy(xpath = "(//label[text()='No'])[4]/parent::div/input") static WebElement deceasedNo;
    @FindBy(xpath = "(//label[text()='Yes'])[4]/parent::div/input") static WebElement deceasedYes;
    @FindBy(id = "deathDatePicker") static WebElement dateOfdeceased;

    @FindBy(name = "contact_name1") static WebElement emergencyContactSearch;
    @FindBy(xpath = "//ul[@role=\"listbox\"]/li") static List<WebElement> emergencyContactOptions;
    @FindBy(xpath = "//input[@placeholder='Relationship']") static WebElement relationshipTextbox;


    // WebElement initialization constructor
    public AddLeadPage()
    {
        PageFactory.initElements(driver,this);
    }
    // Actions methods
    public static void clickOnAddLead() {addLead.click();}

    public static boolean validateCampLejeuneRadio() throws InterruptedException {
        Thread.sleep(1000);
        return campLejeuneRadio.isSelected();
    }
    public static void clickOnToyotaTort(){ toyotaRadio.click();}
    public static void clickOnCampTort(){ campLejeuneRadio.click();}
    public static boolean validateNewLeadRadio(){ return newLeadRadio.isSelected();}
    public static void clickOnExistingLead(){ ExistingLeadRadio.click();}
    public static void searchExistingLead(String searchString)
    {
        searchExistingLead.sendKeys(searchString);
    }
    public static void validateSearchOptions(String SelectionValue)
    {
        for (int i=0; i<=searchOptions.size(); i++)
        {
            String value= searchOptions.get(i).getText();
            System.out.println(value);
            if (value.equalsIgnoreCase(SelectionValue))
            {
                searchOptions.get(i).click();
                break;
            }
        }
    }
    public static void clickOnNewLead()
    {
            newLeadRadio.click();
    }
    public  static boolean validateDefaultEmploymentNature()
    {
        return employmentNatureMilitary.isDisplayed();
    }
    public static void clickOnEmploymentNatureFamily()
    {
        employmentNatureFamily.click();
    }
    public static boolean defaultStatus()
    {
        return defaultStatus.isDisplayed();
    }
    public static void clickOnStatus()
    {
        defaultStatus.click();
    }
    public static void checkStatusOptions(String status)
    {
        for (int i=0; i<= statusOptions.size();i++)
        {
            String value= statusOptions.get(i).getText();
            if (value.equalsIgnoreCase(status))
            {
                statusOptions.get(i).click();
                break;
            }
        }

    }

    public static void titleOptionsCheck(String ttl)
    {
        titleDropdown.click();

        for (WebElement allOptions : titleOptions)
        {
           String title= allOptions.getText();
            System.out.println(title);
            if (title.equalsIgnoreCase(ttl))
            {
                allOptions.click();
                break;
            }
        }
    }
    public static void enterPersonalFN(String fn)
    {
        personalFN.clear();
        personalFN.sendKeys(fn);
    }
    public static void enterPersonalMN(String mn)
    {
        personalMN.clear();
        personalMN.sendKeys(mn);
    }
    public static void enterPersonalLN(String ln)
    {
        personalLN.clear();
        personalLN.sendKeys(ln);
    }

    public static void enterEmail1(String email1)
    {
        emailId1.clear();
        emailId1.sendKeys(email1);
    }

    public static void clickOnMoreEmailOption()
    {
        moreEmail.click();
    }
    public static void enterEmail2(String email2)
    {
        emailId2.clear();
        emailId2.sendKeys(email2);
    }

    public static void enterContact1(String contact1)
    {
        contactNum1.clear();
        contactNum1.sendKeys(contact1);
    }

    public static void clickOnMoreContact()
    {
        moreContact.click();
    }
    public static void enterContact2(String contact2)
    {
        contactNum2.clear();
        contactNum2.sendKeys(contact2);
    }

    public static void selectClaimantChoice() throws InterruptedException {
        Thread.sleep(1000);
        claimantNo.click();
    }
    public static void addMemo(String mm)
    {
        memo.clear();
        memo.sendKeys(mm);
    }

    public static void selectPowerOfAttorney() {
        powerOfAttorneyNo.click();
    }
    public static void selectRelationship(String relationship)
    {
        claimantRelationship.sendKeys(relationship);
    }
    public static void selectClaimantFirstName(String claimantFirst)
    {
        claimantFN.clear();
        claimantFN.sendKeys(claimantFirst);
    }
    public static void selectClaimantMiddleName(String claimantMiddle)
    {
        claimantMN.clear();
        claimantMN.sendKeys(claimantMiddle);
    }
    public static void selectClaimantLastName(String claimantLast)
    {
        claimantLN.clear();
        claimantLN.sendKeys(claimantLast);
    }
    public static void claimantEmail1(String claimantEmail)
    {
        claimantEmailId1.clear();
        claimantEmailId1.sendKeys(claimantEmail);
    }
    public static void clickOnMoreEmailIds()
    {
        claimantMoreEmail.click();
    }
    public static void claimantEmail2(String claimantEmail)
    {
        claimantEmailId2.clear();
        claimantEmailId2.sendKeys(claimantEmail);
    }

    public static void claimantContact1(String contact)
    {
        claimantContactNum1.clear();
        claimantContactNum1.sendKeys(contact);
    }
    public static void clickOnMoreContactNum()
    {
        claimantMoreContact.click();
    }
    public static void claimantContact2(String contact)
    {
        claimantContactNum2.clear();
        claimantContactNum2.sendKeys(contact);
    }

    // Additional details

    public static void clickOnAdditionalDetails()
    {
        AdditionalDetailsLink.click();
    }
    public static void checkStay()
    {
        StayRadioNo.click();
        StayRadioYes.click();
    }
    public static void ClaimantDOBSelection(String dateofBirth)
    {
        claimantDoB.sendKeys(dateofBirth);
    }
    public static void claimantGenderSelection(String gen)
    {
        claimantGender.click();
        for (WebElement option: genderOptions)
        {
            String gender = option.getText();
            if (gender.equalsIgnoreCase(gen))
            {
                option.click();
                break;
            }
        }
    }
    public static void claimantMaritalStatusDD()
    {
        maritalStatus.click();
    }

    public static void claimantMaritalSelection(String maritalStatus)
    {
        for (WebElement maritalOption: maritalStatusOptions)
        {
         String status = maritalOption.getText();
         if (status.equalsIgnoreCase(maritalStatus))
         {
             maritalOption.click();
             break;
         }
        }
    }
    public static void searchPastSpouse(String searchText)
    {
        pastSpouseSearch.sendKeys(searchText);
    }
    public static void selectPastSpouse(String pastSpouseName)
    {
        for (WebElement pastSpouse: pastSpouseSearchOptions)
        {
            String name = pastSpouse.getText();
            if (name.equalsIgnoreCase(pastSpouseName))
            {
                pastSpouse.click();
                break;
            }
        }
    }
    public static void contactPopup()
    {
        addNewContact.click();
        closeAddNewPopup.click();

    }
    public static void claimantMaritalStatusAgain(String status)
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();",maritalStatus);
       // maritalStatus.click();
        for (WebElement element:maritalStatusOptions)
        {
           String statusVal =element.getText();
           if (statusVal.equalsIgnoreCase(status))
           {
               element.click();
               break;
           }
        }
    }
    public static void currentSpouseSearch(String searchText)
    {
        currentSpouse.sendKeys(searchText);
    }
    public static void currentSpouseSelect(String currentSpouseName)
    {
        for (WebElement element:currentSpouseOptions)
        {
            String optionValue = element.getText();
            if (optionValue.equalsIgnoreCase(currentSpouseName))
            {
                element.click();
                break;
            }
        }
    }

    public static boolean checkDisabledNo()
    {
        return disabledNo.isSelected();
    }
    public static void selectDisabledYes()
    {
        disabledYes.click();
    }
    public static void enterDateOfDisability(String dateOfDisability)
    {
        dateOfdisablity.sendKeys(dateOfDisability);
    }

    public static boolean checkDeceasedNo()
    {
        return deceasedNo.isSelected();
    }
    public static void selectDeceasedYes()
    {
        deceasedYes.click();
    }
    public static void enterDateOfdeceased(String dateOfDeceased)
    {
        dateOfdeceased.sendKeys(dateOfDeceased);
    }

    public static void searchEmergency(String searchText)
    {
        emergencyContactSearch.sendKeys(searchText);
    }

    public static void selectEmergencyContact(String emergencyContact)
    {
        for (WebElement element:emergencyContactOptions)
        {
            String emergencyName = element.getText();
            if (emergencyName.equalsIgnoreCase(emergencyContact))
            {
                element.click();
                break;
            }
        }
    }

    public static void emergencyRelationship(String relationship)
    {
        relationshipTextbox.sendKeys(relationship);
    }







































}
