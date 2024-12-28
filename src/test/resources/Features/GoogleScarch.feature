Feature: feature to test google scarch funcationality

  Scenario: Validate google scarch is working
    Given browser is open
    And user is on google scarch page
    When user enters a text in scarch box
    And hits enter
    Then navigate to scarch result
    
    //test
