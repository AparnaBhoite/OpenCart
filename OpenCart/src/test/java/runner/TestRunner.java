package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		//features = { "src/test/resources/features/Registration.feature" }, 
		glue = { "stepdefinition" },
		// tags = "@smoke",
		plugin = { "pretty", "html:target/cucumber-reports" }
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}

