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
	private WebElement logoHeader;

	public HeaderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHeader() {
		return headerSection;
		
		
	}

	public boolean isHeaderVisible() {
		return headerSection.isDisplayed();
	}

	public boolean islogoVisible() {
		return logoHeader.isDisplayed();
	}

	public void getLogo() {
		String allignment = logoHeader.getCssValue("vertical-align");
		if (allignment.equals("middle")) {
			System.out.println("Logo is aligned in the middle.");
		} else {
			System.out.println("Logo is not aligned in the middle.");
		}
	}

}
