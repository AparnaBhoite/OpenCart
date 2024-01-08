package stepdefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.LoginPage;

//import io.cucumber.java.en.*;

public class LoginSteps {
	
	public WebDriver driver;
	private LoginPage loginpg = new LoginPage(driver);

	@When("^the user selects the Login option$")
	public void the_user_selects_the_login_option() {
		loginpg.navigateToLoginPage();
	
	}

	@When("^User enters username (.+)$")
	public void user_enters_username(String Username) {
		loginpg.enterEmail(Username);
	}

	@When("^User enters password (.+)$")
	public void user_enters_password(String Password) {
		loginpg.enterPassword(Password);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() {
		loginpg.clickLoginBtn();
	}

	@Then("^User should see logged in successfully$")
	public void user_should_see_logged_in_successfully() {

	}

}
