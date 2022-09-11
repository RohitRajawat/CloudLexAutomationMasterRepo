Feature: Test the Login functionality for CloudLex MT

#  @smoke   #tags can be apply for feature, scenario or scenario outline
  Scenario: Test the login with valid Username and password
    Given User launch the browser
    And   User navigate to the MassTort website login
    Then  CloudLex title should be display
    And   Username and password fields should be display
    And   Keep me login should be present
    And   Submit button should be present
    When  Check the Forgot password link
    And   Check the Terms of Use link
    And   Check the Schedule a demo link
    When  User Enter Invalid username and Password
    And   Click on Submit button
    When  user enter Valid Username and password
    And   Check the keep me login checkbox
    And   Click on submit button again
    Then  User should be login and navigate to LaunchPad
    Then  Close the browser
