package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HeaderPage;
import utility.ReadConfig;

public class BaseClass {

	public WebDriver driver;
	public HeaderPage Headpg;
	
	public void initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ReadConfig configFile = new ReadConfig();
		driver.get(configFile.getURL());
		driver.manage().window().maximize();
		Headpg = new HeaderPage(driver);
	}
	
	
	
}
