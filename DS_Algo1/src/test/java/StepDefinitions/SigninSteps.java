package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.SigninPage;
import PageObjectModel.homePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninSteps {
	
	WebDriver driver;
	homePage homepage;
	ChromeOptions co;
	DSAlgoPortalPage dsalgoportal;
	SigninPage signinpage;
	
	@Given("The user is in the Home page of ds-algo portal")
	public void the_user_is_in_the_home_page_of_ds_algo_portal() {
		driver = Hooks.browserSetup();
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver); 
		dsalgoportal.GetStarted();
		LoggerLoad.info("User is in DSAlgoPortal Page");
	   
	}

	@When("The user clicks on the Sign-In link")
	public void the_user_clicks_on_the_sign_in_link() throws InterruptedException {
	   
		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		LoggerLoad.info("User is in HomePage");
	}

	@Then("The user is taken to the Login page")
	public void the_user_is_taken_to_the_login_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/login");
		LoggerLoad.info("User is in Login Page");
	   
	}
	
	@When("The user enters {string} and {string}")
	public void the_user_enters_and(String Username, String Password) throws InterruptedException {
		signinpage.loginUserName(Username);
		signinpage.loginUserPassword(Password);
		Thread.sleep(1000);
		LoggerLoad.info("Entering username and password");
	}


	@When("clicks the login button")
	public void clicks_the_login_button() throws InterruptedException {
		signinpage.loginclick();
		Thread.sleep(1000);
		LoggerLoad.info("clicking login button");
	}

	@Then("Verify the {string}")
	public void verify_the(String string) {
		
		if (string.equalsIgnoreCase("Please fill out this field.")) {
			System.out.println("The actual message is"+string);
			Assert.assertEquals(signinpage.errorMessage(string), string);
			LoggerLoad.warn("Please fill out this field");
	     }
	     else if (string.equalsIgnoreCase("Invalid Username and Password")) {
	    	 System.out.println("The actual message is"+string);
	    	assertEquals(signinpage.invalidMessage(), string);
	    	LoggerLoad.warn("Invalid Username and Password");
	     }
	     else if (string.equalsIgnoreCase("You are logged in")) {
	    	 System.out.println("The actual message is"+string);
	    	 assertEquals(signinpage.validMessage(), string);
	    	LoggerLoad.info("Logged in");
	     }
	    
	}
	

	@Given("The user is logged in")
	public void the_user_is_logged_in() throws InterruptedException {
		driver = Hooks.browserSetup();
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		dsalgoportal.GetStarted();
		homepage.DataStructure_Signin();
		signinpage.loginUser("SavvyGeeks", "Savvy@123");
		Thread.sleep(1000);	
		LoggerLoad.info("Logged in ");
		signinpage.getpagetitle();
	   
	}
	
	@When("The user clicks on Sign-Out link")
	public void the_user_clicks_on_sign_out_link() {
	    signinpage.signOut();
	}

	@Then("The user gets the message - Logged out successfully")
	public void the_user_gets_the_message_logged_out_successfully() {
	   signinpage.signOut_Msg();
	   LoggerLoad.info("Logged out successfully");
	}


}
