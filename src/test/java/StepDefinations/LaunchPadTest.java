package StepDefinations;
import com.clxMT.Base.TestBase;
import com.clxMT.Pages.LaunchPadPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.io.IOException;

public class LaunchPadTest extends TestBase
{
    @Then("Default app title should be display")
    public void default_app_title_should_be_display(){
        new LaunchPadPage();
        boolean flag= LaunchPadPage.validateDefaultAppTitle();
        System.out.println(flag);
        Assert.assertTrue(flag);
    }
    @Then("Contact Manager Tile should be display")
    public void contact_manager_tile_should_be_display()
    {
        boolean flag =LaunchPadPage.validateContactManagerTile();
        Assert.assertTrue(flag);

    }
    @Then("Document Manager Tile should be display")
    public void document_manager_tile_should_be_display() {

        boolean flag = LaunchPadPage.validateDocumentManagerTile();
        Assert.assertTrue(flag);

    }
    @Then("Reports tile should be display")
    public void reports_tile_should_be_display() {
       boolean flag= LaunchPadPage.validateReportTile();
       Assert.assertTrue(flag);

    }
    @Then("Lead Manager tile should be display")
    public void lead_manager_tile_should_be_display() {
       boolean flag= LaunchPadPage.validateLeadManager();
       Assert.assertTrue(flag);
    }
    @Then("Workbench and Leads links should be display")
    public void workbench_and_leads_links_should_be_display() {
        boolean flag = LaunchPadPage.validateWorkbenchLeadLink();
        Assert.assertTrue(flag);

       boolean flag1= LaunchPadPage.validateLeadsLink();
       Assert.assertTrue(flag1);
    }
    @Then("Intake Manager tile should be display")
    public void intake_manager_tile_should_be_display() {
       boolean flag= LaunchPadPage.validateIntakeManager();
       Assert.assertTrue(flag);
    }
    @Then("Workbench and Intake links should be display")
    public void workbench_and_intake_links_should_be_display() {
        boolean flag = LaunchPadPage.validateWorkbenchIntakeLink();
        Assert.assertTrue(flag);

        boolean flag1= LaunchPadPage.validateIntakeLink();
        Assert.assertTrue(flag1);
    }
    @Then("Claim Manager Tile should be display")
    public void claim_manager_tile_should_be_display() {
        boolean flag= LaunchPadPage.validateClaimManager();
        Assert.assertTrue(flag);
    }
    @Then("Set as default checkboxes should be display as unselected for Lead , Intake and Claim Manager")
    public void set_as_default_checkboxes_should_be_display_for_lead_intake_and_claim_manager() {
        boolean flag=LaunchPadPage.validateCheckboxLead();
        System.out.println(flag);
        Assert.assertFalse(flag);

        boolean flag1= LaunchPadPage.validateCheckboxIntake();
        Assert.assertFalse(flag1);

    }
    @Then("Add New button should be display on top")
    public void add_new_button_should_be_display_on_top() {
        boolean flag =LaunchPadPage.validateAddNewButton();
         Assert.assertTrue(flag);
    }
    @When("User clicks on Add new button")
    public void user_clicks_on_add_new_button() {
        new LaunchPadPage();
        LaunchPadPage.clickOnAddButton();
    }
    @Then("List of add options should be display")
    public void list_of_add_options_should_be_display() {
        boolean flag= LaunchPadPage.validateAddButtonOption();
        Assert.assertTrue(flag);
    }
    @Then("Notification Bell should be display")
    public void notification_bell_should_be_display() {
        boolean flag = LaunchPadPage.validateNotificationBell();
        Assert.assertTrue(flag);

    }
    @When("user click on notification bell")
    public void user_click_on_notification_bell() {
        LaunchPadPage.clickOnNotificationBell();

    }
    @Then("Notification list should be open")
    public void notification_list_should_be_open() {
        boolean flag= LaunchPadPage.validateNotificationList();
    }
    @Then("Nine square menu should be display")
    public void nine_square_menu_should_be_display() {
        boolean flag= LaunchPadPage.validateNineSquare();
        Assert.assertTrue(flag);
    }
    @When("Click on nine square menu")
    public void click_on_nine_square_menu() throws InterruptedException {
        Thread.sleep(2000);
        LaunchPadPage.clickOnNineSquare();
    }
    @Then("Nine square menu should be open with options")
    public void nine_square_menu_should_be_open_with_options() {
        boolean flag= LaunchPadPage.validateNineSquareOption();
        Assert.assertTrue(flag);
    }
    @Then("Profile pic should be display")
    public void profile_pic_should_be_display() {
        boolean flag = LaunchPadPage.validateProfile();
        Assert.assertTrue(flag);
    }
    @When("Click on profile pic icon")
    public void click_on_profile_pic_icon() throws IOException {
        LaunchPadPage.clickOnProfile();
    }
    @Then("Login user name and role should be display")
    public void login_user_name_and_role_should_be_display() throws IOException {
       boolean flag= LaunchPadPage.validateUsername();
       Assert.assertTrue(flag);

       boolean flag1= LaunchPadPage.validateUserRole();
       Assert.assertTrue(flag1);
    }
    @Then("SidePanel should be display")
    public void side_panel_should_be_display()
    {
          boolean flag = LaunchPadPage.validateSidePanel();
          Assert.assertTrue(flag);
    }

}
