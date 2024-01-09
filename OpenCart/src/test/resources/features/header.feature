Feature: Verify the header on the OpenCart demo website

  Background: 
    Given I open the OpenCart demo website

  Scenario: Verify header section added on the website
    Then I should see the header section

  Scenario: Verify the logo on the header is aligned
    Then the logo in the header should be aligned correctly

  #Scenario: Verify navigation bar is displayed correctly
    #Then the navigation bar should be displayed correctly
#
  #Scenario: Verify header is sticky or fixed
    #Then the header should be sticky or fixed as per requirements and design
#
  #Scenario: Verify all links open on the header
    #Then all links on the header should be present
#
  #Scenario: Verify correct page opens on link click
    #When I click on a link in the header
    #Then the correct page should be opened
#
  #Scenario: Verify home page opens on clicking logo
    #When I click on the logo in the header
    #Then the home page should be opened
#
  #Scenario: Verify link color changes on mouse hover
    #When I hover over a link in the header
    #Then the color of the link should change
#
  #Scenario: Verify search bar in the header
    #Then there should be a search bar in the header
#
  #Scenario: Verify dropdown options on header
    #When I hover or click on a dropdown in the header
    #Then the options should be displayed correctly
#
  #Scenario: Verify currency selector is displayed
    #Then the currency selector should be displayed correctly
#
  #Scenario: Verify header background color
    #Then the header's background color should be as specified
