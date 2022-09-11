Feature: CloudLex Launchpad

#  @sanity
  Scenario: Check the Launchpad

    Given User launch the browser
    And  User navigate to the MassTort website login
    When user enter Valid Username and password
    Then Click on Submit button
    And  User should be login and navigate to LaunchPad
    And  Default app title should be display
    And  Contact Manager Tile should be display
    And  Document Manager Tile should be display
    And  Reports tile should be display
    And  Lead Manager tile should be display
    And  Workbench and Leads links should be display
    And  Intake Manager tile should be display
    And  Workbench and Intake links should be display
    And  Claim Manager Tile should be display
    And  Set as default checkboxes should be display as unselected for Lead , Intake and Claim Manager
    And  Add New button should be display on top
    When User clicks on Add new button
    Then List of add options should be display
    And  Notification Bell should be display
    When user click on notification bell
    Then Notification list should be open
    And  Nine square menu should be display
    When Click on nine square menu
    Then Nine square menu should be open with options
    And  Profile pic should be display
    When Click on profile pic icon
    Then Login user name and role should be display
    And SidePanel should be display
    Then Close the browser

