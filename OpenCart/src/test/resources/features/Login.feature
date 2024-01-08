Feature: OpenCart Login

  Background: 
    Given the user is on the OpenCart homepage

  Scenario Outline: User logs in with credentials
    When the user clicks on My Account drop menu
    And the user selects the Login option
    And User enters username <username>
    And User enters password <password>
    And User clicks on the login button
    Then User should see logged in successfully

    Examples: 
      | username                 | password       |
      | aparnabhoiteqa@gmail.com | aparnaP@ssw0rd |
