package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HeaderPage;
import utility.ReadConfig;

public class BaseClass {

	public WebDriver driver;
	public HeaderPage headPage;
	public ReadConfig configFile;
	

	public void initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		configFile = new ReadConfig();
		
		driver.get(configFile.getURL());
		driver.manage().window().maximize();
		headPage = new HeaderPage(driver);
	}

	public void closeWebDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	

}
