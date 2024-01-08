package stepdefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegisterPage;

public class RegistrationSteps {
	
	private WebDriver driver;
	private RegisterPage registerPage = new RegisterPage(driver);

	@Given("^the user is on the OpenCart homepage$")
	public void the_user_is_on_the_open_cart_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}

	@When("^the user clicks on My Account drop menu$")
	public void the_user_click_on_my_account_drop_menu() {
		registerPage.navigateTomyAccount();		
	}

	@And("^the user selects the Register option$")
	public void the_user_selects_the_register_option() {
		registerPage.navigateToRegisterPage();
	}

	@And("^the user provides a valid first name (.+)$")
	public void the_user_provides_a_valid_first_name(String First) {
		registerPage.enterFirstName(First);
	}

	@And("^the user provides a valid last name (.+)$")
	public void the_user_provides_a_valid_last_name(String Last) {
		registerPage.enterLastName(Last);
	}

	@And("^the user enters a valid (.+) address$")
	public void the_user_enters_a_valid_address(String email) {
		registerPage.enterEmail(email);
	}

	@And("^the user sets a secure and valid (.+)$")
	public void the_user_sets_a_secure_and_valid(String password) {
		registerPage.enterPassword(password);
	}

	@And("^the user select the Yes option for newsletter subscription$")
	public void the_the_user_select_the_yes_option_for_newsletter_subscription() {
		registerPage.selectNewsletter();
	}

	@And("^the user agrees to the privacy policy$")
	public void the_user_agrees_to_the_privacy_policy() {
		registerPage.agreePrivacyPolicy();
	}

	@And("^the user clicks on the continue button$")
	public void the_user_clicks_on_the_continue_button() {
		registerPage.clickContinueButton();
	}

	@Then("^the user should be redirected to message page$")
	public void the_user_should_be_redirected_to_message_page() {
		assertTrue(registerPage.isMessagePageDisplayed());
	}

	@And("^the user clicks on the continue$")
	public void the_user_clicks_on_the_continue_btn() {
		registerPage.clickContinueBtn();
	}

	@Then("^the user should be redirected to My Account page$")
	public void the_user_should_be_redirected_to_my_account_page() {
		assertTrue(registerPage.isMyAccountPageDisplayed());
		driver.quit(); 
	}

}
