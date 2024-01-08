package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;

	@FindBy(linkText = "My Account")
	private WebElement myAccountDropdown;

	@FindBy(linkText = "Register")
	private WebElement registerOption;

	@FindBy(id = "input-firstname")
	private WebElement firstNameInput;

	@FindBy(id = "input-lastname")
	private WebElement lastNameInput;

	@FindBy(id = "input-email")
	private WebElement emailInput;

	@FindBy(id = "input-password")
	private WebElement passwordInput;

	@FindBy(id = "input-newsletter-yes")
	private WebElement newsletterYesCheckbox;

	@FindBy(name = "agree")
	private WebElement privacyPolicyCheckbox;

	@FindBy(xpath = "//button[@type='submit']") 
	private WebElement continueButton;
	
	@FindBy (xpath = "//a[normalize-space()='Continue']")
	private WebElement continueBtn;
	
	@FindBy(tagName = "h1")
	private WebElement accountInformation;

	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	private WebElement accountPage;

	// Constructor to initialize the WebDriver and PageFactory
	public RegisterPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	public void navigateTomyAccount() {
		myAccountDropdown.click();
	}

	public void navigateToRegisterPage() {
		registerOption.click();
	}

	public void enterFirstName(String First) {
		firstNameInput.sendKeys(First);
	}

	public void enterLastName(String Last) {
		lastNameInput.sendKeys(Last);
	}

	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void selectNewsletter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		newsletterYesCheckbox.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void agreePrivacyPolicy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	
		privacyPolicyCheckbox.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickContinueButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", continueButton);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		continueButton.click();

	}

	public boolean isMessagePageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return accountInformation.isDisplayed();

	}
    
	public void clickContinueBtn() {		
		continueBtn.click();
	}
	
	public boolean isMyAccountPageDisplayed() {
		return accountPage.isDisplayed();
	}

}
