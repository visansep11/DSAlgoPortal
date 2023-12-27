package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.time.Duration;

//import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.homePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSAlgoSteps {

	ChromeOptions co;
	WebDriver driver;
	DSAlgoPortalPage dsalgoportal;
	homePage homepage;
	public static Logger LOGGER = (Logger) LogManager.getLogger(DSAlgoSteps.class);

	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws InterruptedException {
		driver = Hooks.browserSetup();
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		driver.manage().window().maximize(); 
		
	}

	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
		LoggerLoad.info("I am in DSAlgo Portal Page");
		System.out.println("The user is in" + driver);
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) throws InterruptedException {
		
		LoggerLoad.info("DSAlgo portal get started page");
		dsalgoportal.GetStarted();
		Thread.sleep(1000);
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() throws InterruptedException {
		LoggerLoad.info("I am in Home Page");
		homePage.displayelement();
		System.out.println("The user landed in homepage");
		Thread.sleep(1000);
	}


}
