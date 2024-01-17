package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

	WebDriver driver;

	@FindBy(css = "header")
	private WebElement headerSection;

	@FindBy(xpath = "//img[@title='Your Store']")
	private WebElement logo;

	public HeaderPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHeader() {
		return headerSection;
	}

	public void isHeaderVisible() {
		if (headerSection.isDisplayed()) {
			System.out.println("Header is visible");
		} else {
			System.out.println("Header is not visible");
		}
	}

	public void islogoVisible() {
		
		if (logo.isDisplayed()) {
			System.out.println("Logo is visible on the webpage.");
		} else {
			System.out.println("Logo is not visible on the webpage.");
		}
	}

	public void getLogo() {
		String allignment = logo.getCssValue("vertical-align");
		if (allignment.equals("middle")) {
			System.out.println("Logo is aligned in the middle.");
		} else {
			System.out.println("Logo is not aligned in the middle.");
		}
	}

}
