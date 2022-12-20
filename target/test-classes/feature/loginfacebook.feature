Feature: Test login functionality

  Scenario Outline: Check Facebook login with valid credentials
    Given Browser is open
    And user is on login page
    When user enter <userid> and <password>
    And user clicks on login
    Then user naviagted to the home page

    Examples: 
      | userid                    | password   |
      | gagankaushik655@gmail.com | gagan@123  |
      | gagangoyal214@gmail.com   | gagan@1234 |
