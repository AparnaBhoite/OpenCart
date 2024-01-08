Feature: Verify the header on the OpenCart demo website

  Scenario: Verify the presence of the header
    Given I open the OpenCart demo website
    Then the header is displayed

  #Scenario: Check the presence of the logo in the header
    #Given I open the OpenCart demo website
    #Then the logo should be visible
    #
  #Scenario: Verify the presence of navigation links
    #Given I open the OpenCart demo website
    #Then the header should contain the following navigation links:
      #| Home      |
      #| Products  |
      #| Contact Us|
