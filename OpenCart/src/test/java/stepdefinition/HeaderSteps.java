package stepdefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HeaderSteps extends BaseClass {
	
	@Before
	public void setUp() {
		initializeWebDriver();
	}

	@After
	public void tearDown() {
		closeWebDriver();
	}

	@Given("^I open the OpenCart demo website$")
	public void i_open_the_open_cart_demo_website() {
		// initializeWebDriver();
	}

	@Then("^I should see the header section$")
	public void I_should_see_the_header_section() {
		headPage.isHeaderVisible();
	}

	@Then("the logo in the header should be aligned correctly")
	public void the_logo_in_the_header_should_be_aligned_correctly() {
		headPage.islogoVisible();
		headPage.getLogo();
	}

//	@Then("the navigation bar should be displayed correctly")
//	public void the_navigation_bar_should_be_displayed_correctly() {
//	    
//	}
//
//	@Then("the header should be sticky or fixed as per requirements and design")
//	public void the_header_should_be_sticky_or_fixed_as_per_requirements_and_design() {
//	   
//	}
//
//	@Then("all links on the header should be present")
//	public void all_links_on_the_header_should_be_present() {
//	    
//	}
//
//	@When("I click on a link in the header")
//	public void i_click_on_a_link_in_the_header() {
//	   
//	}
//
//	@Then("the correct page should be opened")
//	public void the_correct_page_should_be_opened() {
//	   
//	}
//
//	@When("I click on the logo in the header")
//	public void i_click_on_the_logo_in_the_header() {
//	    
//	}
//
//	@Then("the home page should be opened")
//	public void the_home_page_should_be_opened() {
//	    
//	}
//
//	@When("I hover over a link in the header")
//	public void i_hover_over_a_link_in_the_header() {
//	    
//	}
//
//	@Then("the color of the link should change")
//	public void the_color_of_the_link_should_change() {
//	   
//	}
//
//	@Then("there should be a search bar in the header")
//	public void there_should_be_a_search_bar_in_the_header() {
//	    
//	}
//
//	@When("I hover or click on a dropdown in the header")
//	public void i_hover_or_click_on_a_dropdown_in_the_header() {
//	    
//	}
//
//	@Then("the options should be displayed correctly")
//	public void the_options_should_be_displayed_correctly() {
//	    
//	}
//
//	@Then("the currency selector should be displayed correctly")
//	public void the_currency_selector_should_be_displayed_correctly() {
//	   
//	}
//
//	@Then("the header's background color should be as specified")
//	public void the_header_s_background_color_should_be_as_specified() {
//	   
//	}

}
