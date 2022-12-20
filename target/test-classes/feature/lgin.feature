Feature: feature to test login

  @Test1 @Regression
  Scenario: Check login successful with valid credentials
    Given User is on login page
    When user enter username and password
    And Add clicks on login button
    Then user is navigated to login page
    