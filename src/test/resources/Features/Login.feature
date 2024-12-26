Feature: Test Login Funcationality

  Scenario Outline: Check Login is successful with valid credentials
    Given browser is opend
    And user is on login page
    When user enter <username> and <password>
    And user click on login button
    Then user is navigated to home page

    Examples: 
      | username | password    |
      | test     |         123 |
      | wrong    |        2344 |
      | student  | Password123 |
