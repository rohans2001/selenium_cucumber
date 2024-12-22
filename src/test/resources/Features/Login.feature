Feature: Test the login funcation

  Scenario: Check login is successful with valid credentials
    Given user is in login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to the home page
