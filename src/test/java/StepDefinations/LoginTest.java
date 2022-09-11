package StepDefinations;
import com.clxMT.Base.TestBase;
import com.clxMT.Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.io.IOException;

public class LoginTest extends TestBase
{
    @Given("User launch the browser")
    public void user_launch_the_browser() throws IOException
    {
       readProperties();
       launchBrowser();
    }

    @Given("User navigate to the MassTort website login")
    public void user_navigate_to_the_mass_tort_website_login()
    {
        urlNavigate();
    }

    @Then("CloudLex title should be display")
    public void cloud_lex_title_should_be_display() throws IOException {
       String title= LoginPage.validateLoginTitle();
        System.out.println(title);
        Assert.assertEquals("Welcome to CloudLex | CloudLex",title);
    }
    @Then("Username and password fields should be display")
    public void username_and_password_fields_should_be_display()
    {
        new LoginPage();  // very imported in order to initiate the webElements using constructor;
        boolean flag = LoginPage.validateUsernameTitle();
        System.out.println(flag);
        Assert.assertTrue(flag);

        boolean flag2= LoginPage.validatePasswordTitle();
        System.out.println(flag2);
        Assert.assertTrue(flag2);
    }
    @Then("Keep me login should be present")
    public void keep_me_login_should_be_present()
    {
        boolean flag = LoginPage.validateKeepMeLogin();
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Then("Submit button should be present")
    public void submit_button_should_be_present()
    {
       boolean flag= LoginPage.validateLoginBtn();
        System.out.println(flag);
       Assert.assertTrue(flag);
    }
    @When("Check the Forgot password link")
    public void click_the_forgot_password_link() throws InterruptedException, IOException {
         boolean flag = LoginPage.validateForgotLink();
         System.out.println(flag);
         Assert.assertTrue(flag);

         LoginPage.checkForgotPasswordTab();  // to switch forgot password tab validate and close
    }
    @When("Check the Terms of Use link")
    public void click_the_terms_of_use_link() throws InterruptedException, IOException {
      boolean flag = LoginPage.validateTermsOfUseLink();
      Assert.assertTrue(flag);

      LoginPage.checkTermOfUsePage();  // to switch the terms of use tab validate and close
    }
    @When("Check the Schedule a demo link")
    public void click_on_schedule_a_demo_link() throws InterruptedException, IOException {
        boolean flag = LoginPage.validateScheduleDemoLink();
        Assert.assertTrue(flag);

        LoginPage.checkScheduleDemoPage(); // to switch schedule demo link and validate
    }
    @When("User Enter Invalid username and Password")
    public void user_enter_invalid_username_and_password()
    {
        LoginPage.invalidLogin();
    }
    @When("Click on Submit button")
    public void click_on_submit_button() throws InterruptedException, IOException
    {
        new LoginPage();
        LoginPage.submit();
    }
    @When("user enter Valid Username and password")
    public void user_enter_valid_username_and_password() throws IOException
    {
        new LoginPage();
        LoginPage.validLogin();
    }
    @When("Check the keep me login checkbox")
    public void Check_the_keep_me_login_checkbox()
    {
        LoginPage.clickKeepMeLogin();
    }

    @When("Click on submit button again")
    public void click_on_submit_button_again() throws InterruptedException, IOException {
        LoginPage.submit();
    }
    @Then("User should be login and navigate to LaunchPad")
    public void user_should_be_login_and_navigate_to_LaunchPad() throws InterruptedException, IOException {
        new LoginPage();
        boolean flag = LoginPage.launchPad();
        Assert.assertTrue(flag);
        screenshot(driver,"LaunchPad");
    }
    @Then("Close the browser")
    public void Close_the_browser()
   {
       closeBrowser();
   }
}
