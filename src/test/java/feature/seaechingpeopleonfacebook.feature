Feature: Searching people on facebook

  Scenario Outline: Search people on facebook page
    Given Browser is open
    And user is on login page
    When user enter <userid> and <password>
    And user clicks on login
    #Then user naviagted to the home page
    And user clicks on search page
    When user enter name of the person
    And click on search

    Examples: 
      | userid                    | password  |
      | gagankaushik655@gmail.com | gagan@123 |
