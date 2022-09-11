Feature: Test the Add Lead Functionality

  Background:
      Given User launch the browser
      And   User navigate to the MassTort website login
      When  user enter Valid Username and password
      And   Click on Submit button
      And   User clicks on Add new button
      And   Click on Add Lead option

  Scenario: Check the basic details
      When CampLejeune Mass tort should be selected default
      Then user select the toyota tort
      And  again select the Camp tort option
      When Add new Lead option should be selected by default
      And  user select the existing lead option
      And  Search the existing lead with name "Rohit"
      And  select the lead "Rohit VCF" from existing list
      And  user again switched to the Add new lead option
      And  Nature of employment should be Military by default selected
      Then user select Nature of employment as Family Member
      And  Default status should be selected as New Leads
      And  user click on status dropdown
      And  check the status options and Select "Portal Invite Sent"
      And  Close the browser

  Scenario Outline:Check the Personal details
        When user check the title options and select "Esq."
        Then select the first name as "<FName>"
        And  select the middle name as "<MName>"
        And  select the last name as "<LName>"
        And  Select the email "<Email>"
        And  Click on more email option
        And  select the another email "<Email2>"
        And  select the contact "<ContactNum>"
        And  Click on more contact number option
        And  select the another contact "<ContactNum2>"
        Then Select the claimant choice as No
        And  add the memo details "This is the memo check"
        Then Close the browser

        Examples:
          |FName      |MName        |LName        |Email            |Email2             |ContactNum |  ContactNum2 |
          |  Rohit's  | Singh's     |Rajawat's    |rrajawat         | rohitrajawat      | 7990365663| 1234578901   |
          |  Rohit    | Singh       |Rajawat      |rrajawat@clx.com |  rohit@outlook.com| 8460589577| 7276611926   |


  Scenario: Check the Claimant information
       When user scroll the page
       Then Select the claimant choice as No
       When User select power of attorney option as No
       And  user add the relationship "Son"
       And  user enter the Claimant FirstName MiddleName and LastName
            |FirstName | MiddleName | LastName    |
            |@RSR123's | S@%1'23   | Raj'a8745#$% |
            |Mohit     | Singh     | Chouhan      |
       And  click on more email
       And  add the email ids
            |email1              |email2                     |
            |r12@#'s@gmail.com   | r#$%'123@yopmail.com      |
            |rrajawat@gmail.com  | rohit11rajawat@yopmail.com|
       And  click on more contact number
       And  add the Contact numbers
            |contact1         |contact2        |
            |31234567898888   | 879654122333333|
            |8460589577       | 7990365663     |
       Then Close the browser

  Scenario: Check the Additional Details
       Given user scroll the page
       Given User click on Additional Details section
       When Select Yes for the claimant stay
       And  Enter claimant DOB as "11/12/1990"
       And  Select the Claimant Gender as "Male"
       And  User clicks on the marital Status dropdown
       And  Select the Marital Status as "Divorced"
       Then Search for the past spouse with name "Ricki"
       And  Select Past spouse "Rickii"
       And  Click on Add new Contact and Close it
       When Select Marital status "Married"
       Then Search for the Current Spouse with name "Ricki"
       And  select the current spouse "Rickie M. Thomas"
       Then Search for the past spouse with name "Ricki"
       And  Select Past spouse "Rickii"
       And  Check Claimant disabled option should No by default
       And  Select Claimant disabled option as Yes
       And  User select the date of disability as "01/01/2000"
       And  Check Claimant deceased option should No by default
       And  Select Claimant deceased option as Yes
       Then User select the date of deceased as "01/01/2002"
       When Search a Emergency contact with "Rohit"
       Then Select "Rohit VCF" as Emergency contact
       And  Select Relationship as "Friend"
       Then Close the browser
