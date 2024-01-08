Feature: User Registration on OpenCart

  Scenario Outline: Creating a new account with subscription
    Given the user is on the OpenCart homepage
    When the user clicks on My Account drop menu
    And the user selects the Register option
    And the user provides a valid first name <First>
    And the user provides a valid last name <Last>
    And the user enters a valid <email> address
    And the user sets a secure and valid <password>
    And the user select the Yes option for newsletter subscription
    And the user agrees to the privacy policy
    And the user clicks on the continue button
    Then the user should be redirected to message page
    And the user clicks on the continue 
    Then the user should be redirected to My Account page

    Examples: 
      | First | Last    | email                     | password      |
      #| AparnaTwo  | Smith     | aparnabhoiteqa1@gmail.com     | securePass123 |
      #| Jane  | Smith   | jane.smith@example.com    | myPassword456 |
      | Alice | Johnson | alice.johnson@example.com | strongPass789 |
