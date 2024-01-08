package pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
		
	@FindBy (xpath = "//a[normalize-space()='Login']")
	private WebElement loginOption;
	
	@FindBy (id = "input-email")
	private WebElement email;
	
	@FindBy (id = "input-password")
	private WebElement pwd;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToLoginPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginOption));	
		//loginOption.click();
	}
	
	public void enterEmail(String emailadd) {
		email.sendKeys(emailadd);
	}
	
	public void enterPassword(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
}
