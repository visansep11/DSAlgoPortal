package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Viji\\workspace\\DS_Algo1\\src\\test\\resources\\features\\01DSHome.feature"},  
		glue = {"StepDefinitions", "ApplicationHooks"},
		monochrome=true,  //display console output in a proper readable format
		dryRun = false, //to check the mapping is proper between feature file and step def file
//				plugin={"junit:reports/junit/reports.xml", "pretty:target/cucumber-pretty.text",
//				"html:target/cucumber-html-report","json:target/cucumber.json",
//				"usage:target/cucumber-usage.json",}
				plugin = {
		                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		        }
		
		)

public class TestRunner {
}







