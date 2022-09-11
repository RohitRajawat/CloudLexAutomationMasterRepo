package StepDefinations;
import com.clxMT.Base.TestBase;
import com.clxMT.Pages.AddLeadPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.clxMT.Pages.AddLeadPage.*;

public class AddLeadTest extends TestBase {
    // Basic details
    @When("Click on Add Lead option")
    public void click_on_add_Lead_option() {
        new AddLeadPage();
        AddLeadPage.clickOnAddLead();
    }
    @When("CampLejeune Mass tort should be selected default")
    public void camp_lejeune_mass_tort_should_be_selected_default() throws InterruptedException {
        boolean flag = AddLeadPage.validateCampLejeuneRadio();
        Assert.assertTrue(flag);
    }

    @Then("user select the toyota tort")
    public void user_select_the_toyota_tort() throws IOException {
        AddLeadPage.clickOnToyotaTort();
        screenshot(driver, "TortType");
    }

    @Then("again select the Camp tort option")
    public void again_select_the_mass_tort_option() {
        AddLeadPage.clickOnCampTort();
    }

    @When("Add new Lead option should be selected by default")
    public void add_new_lead_option_should_be_selected_by_default() {
        boolean flag = AddLeadPage.validateNewLeadRadio();
        Assert.assertTrue(flag);
    }

    @When("user select the existing lead option")
    public void user_select_the_existing_lead_option() {
        AddLeadPage.clickOnExistingLead();
    }

    @When("Search the existing lead with name {string}")
    public void search_the_existing_lead(String searchStr) throws IOException {
        AddLeadPage.searchExistingLead(searchStr);
        screenshot(driver, "SearchLead");
    }

    @When("select the lead {string} from existing list")
    public void select_the_lead_from_existing_list(String slValue) throws InterruptedException {
        Thread.sleep(1000);
        AddLeadPage.validateSearchOptions(slValue);
    }

    @When("user again switched to the Add new lead option")
    public void user_again_switched_to_the_add_new_lead_option() {
        AddLeadPage.clickOnNewLead();
    }

    @When("Nature of employment should be Military by default selected")
    public void nature_of_employment_should_be_military_by_default_selected() {
        boolean flag = AddLeadPage.validateDefaultEmploymentNature();
        Assert.assertTrue(flag);
    }

    @Then("user select Nature of employment as Family Member")
    public void user_select_nature_of_employment_as_family_member() {
        AddLeadPage.clickOnEmploymentNatureFamily();
    }

    @Then("Default status should be selected as New Leads")
    public void default_status_should_be_selected_as_new_leads() {
        boolean flag = AddLeadPage.defaultStatus();
        Assert.assertTrue(flag);
    }

    @Then("user click on status dropdown")
    public void user_click_on_status_dropdown() {
        AddLeadPage.clickOnStatus();
    }

    @Then("check the status options and Select {string}")
    public void check_the_status_options(String st) throws IOException {
        AddLeadPage.checkStatusOptions(st);
        screenshot(driver, "StatusSelect");
    }

    // personal details
    @When("user check the title options and select {string}")
    public void user_check_the_title_options_and_select_jr(String title) {
        new AddLeadPage();
        AddLeadPage.titleOptionsCheck(title);
    }

    @Then("select the first name as {string}")
    public void select_the_Personal_FirstName(String FN) {
        AddLeadPage.enterPersonalFN(FN);

    }

    @Then("select the middle name as {string}")
    public void select_the_personal_MiddleNAme(String MN) {
        AddLeadPage.enterPersonalMN(MN);
    }

    @Then("select the last name as {string}")
    public void select_the_personal_LastName(String LN) {
        AddLeadPage.enterPersonalLN(LN);
    }

    @Then("Select the email {string}")
    public void select_the_email1(String email1) {
        AddLeadPage.enterEmail1(email1);
    }

    @Then("Click on more email option")
    public void click_on_more_email_option() {
        AddLeadPage.clickOnMoreEmailOption();
    }

    @Then("select the another email {string}")
    public void select_the_email2(String email2) {
        AddLeadPage.enterEmail2(email2);
    }

    @Then("select the contact {string}")
    public void select_the_contact1(String contact1) {
        AddLeadPage.enterContact1(contact1);
    }

    @Then("Click on more contact number option")
    public void click_on_more_contact_number_option() {
        AddLeadPage.clickOnMoreContact();
    }

    @Then("select the another contact {string}")
    public void select_the_contact2(String contact2) {
        AddLeadPage.enterContact2(contact2);
    }

    @Then("Select the claimant choice as No")
    public void Select_the_claimant_choice_as_No() throws InterruptedException {
        AddLeadPage.selectClaimantChoice();
    }

    @Then("add the memo details {string}")
    public void add_the_memo_details(String memo) throws IOException, InterruptedException {
        AddLeadPage.addMemo(memo);
        Thread.sleep(1000);
        screenshot(driver, "PersonalDetails");
    }

    // Claimant information
    @When("user scroll the page")
    public static void scrollPage() throws InterruptedException {
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        Thread.sleep(1000);
        jse.executeScript("document.getElementById('IdForScrollFormBody').scrollTop=1200"); // Inner scroll bar
    }

    @When("User select power of attorney option as No")
    public void user_select_power_of_attorney_option_as_no() throws InterruptedException {
        new AddLeadPage();
        AddLeadPage.selectPowerOfAttorney();
    }

    @When("user add the relationship {string}")
    public void user_add_the_relationship(String relation) {
        AddLeadPage.selectRelationship(relation);
    }

    @When("user enter the Claimant FirstName MiddleName and LastName")
    public void user_enter_the_claimant_first_name_middle_name_and_last_name(DataTable claimantNameDetails) //Always import from cucumber.dataTable
    {
        List<Map<String, String>> data = claimantNameDetails.asMaps(String.class, String.class);

        AddLeadPage.selectClaimantFirstName(data.get(0).get("FirstName"));
        AddLeadPage.selectClaimantMiddleName(data.get(0).get("MiddleName"));
        AddLeadPage.selectClaimantLastName(data.get(0).get("LastName"));
        AddLeadPage.selectClaimantFirstName(data.get(1).get("FirstName"));
        AddLeadPage.selectClaimantMiddleName(data.get(1).get("MiddleName"));
        AddLeadPage.selectClaimantLastName(data.get(1).get("LastName"));
    }

    @When("click on more email")
    public void click_on_more_email() {
        AddLeadPage.clickOnMoreEmailIds();
    }

    @When("add the email ids")
    public void add_the_email_ids(DataTable emails) {
        List<Map<String, String>> data = emails.asMaps(String.class, String.class);
        AddLeadPage.claimantEmail1(data.get(0).get("email1"));
        AddLeadPage.claimantEmail2(data.get(0).get("email2"));
        AddLeadPage.claimantEmail1(data.get(1).get("email1"));
        AddLeadPage.claimantEmail2(data.get(1).get("email2"));
    }

    @When("click on more contact number")
    public void click_on_more_contact_number() {
        AddLeadPage.clickOnMoreContactNum();
    }

    @When("add the Contact numbers")
    public void add_the_Contact_numbers(DataTable contacts) {
        List<Map<String, String>> data = contacts.asMaps(String.class, String.class);

        AddLeadPage.claimantContact1(data.get(0).get("contact1"));
        AddLeadPage.claimantContact2(data.get(0).get("contact2"));
        AddLeadPage.claimantContact1(data.get(1).get("contact1"));
        AddLeadPage.claimantContact2(data.get(1).get("contact2"));
    }

    // Lead Additional Details
    @Given("User click on Additional Details section")
    public void user_click_on_additional_details_section()
    {
       clickOnAdditionalDetails();
    }

    @When("Select Yes for the claimant stay")
    public void select_yes_for_the_claimant_stay() {
        checkStay();
    }
    @When("Enter claimant DOB as {string}")
    public void enter_claimant_dob_as(String DOB)
    {
         ClaimantDOBSelection(DOB);
    }
    @When("Select the Claimant Gender as {string}")
    public void select_the_claimant_gender_as(String gender)
    {
        claimantGenderSelection(gender);
    }

    @When("User clicks on the marital Status dropdown")
    public void maritalStatusSelection()
    {
        claimantMaritalStatusDD();
    }
    @When("Select the Marital Status as {string}")
    public void select_the_marital_status_as(String status) {

        claimantMaritalSelection(status);
    }

    @Then("Search for the past spouse with name {string}")
    public void search_for_the_past_spouse_with_name(String searchText)
    {
         searchPastSpouse(searchText);
    }
    @Then("Select Past spouse {string}")
    public void select_past_spouse(String pastSpouseName) {
        selectPastSpouse(pastSpouseName);
    }
    @Then("Click on Add new Contact and Close it")
    public void click_on_add_new_contact_and_close_it() throws InterruptedException {
        contactPopup();
        Thread.sleep(2000);
    }
    @When("Select Marital status {string}")
    public void select_marital_status(String status)
    {
        claimantMaritalStatusAgain(status);
    }

    @Then("Search for the Current Spouse with name {string}")
    public void search_for_the_current_spouse_with_name(String searchText) {
        currentSpouseSearch(searchText);
    }
    @Then("select the current spouse {string}")
    public void select_the_current_spouse(String currentSpouse) {
        currentSpouseSelect(currentSpouse);
    }
    @Then("Check Claimant disabled option should No by default")
    public void check_claimant_disabled_option_should_no_by_default() {
        boolean flag = checkDisabledNo();
        Assert.assertTrue(flag);
    }
    @Then("Select Claimant disabled option as Yes")
    public void select_claimant_disabled_option_as_yes() {
       selectDisabledYes();
    }
    @Then("User select the date of disability as {string}")
    public void user_select_the_date_of_disability_as(String dateOfDisability) {
      enterDateOfDisability(dateOfDisability);
    }

    @Then("Check Claimant deceased option should No by default")
    public void check_claimant_deceased_option_should_no_by_default() {
       boolean flag = checkDeceasedNo();
       Assert.assertTrue(flag);
    }
    @Then("Select Claimant deceased option as Yes")
    public void select_claimant_deceased_option_as_yes() {
       selectDeceasedYes();
    }
    @Then("User select the date of deceased as {string}")
    public void user_select_the_date_of_deceased_as(String dateOfDeceased) {
        enterDateOfdeceased(dateOfDeceased);
    }
    @When("Search a Emergency contact with {string}")
    public void search_a_emergency_contact_with(String searchContactText) {
        searchEmergency(searchContactText);
    }
    @Then("Select {string} as Emergency contact")
    public void select_as_emergency_contact(String emergencyContact) throws InterruptedException {
        selectEmergencyContact(emergencyContact);
        Thread.sleep(1000);
    }
    @Then("Select Relationship as {string}")
    public void select_relationship_as(String relationShip) {
        emergencyRelationship(relationShip);
    }




}
