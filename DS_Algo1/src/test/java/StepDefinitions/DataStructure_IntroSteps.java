package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.DataStructure_IntroPage;
import PageObjectModel.SigninPage;
import PageObjectModel.homePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructure_IntroSteps {

	WebDriver driver;
	homePage homepage;
	ChromeOptions co;
	DSAlgoPortalPage dsalgoportal;
	SigninPage signinpage;
	DataStructure_IntroPage dataStructure_intropage;
	
	@Given("The user is in the Home page of ds-algo portal and click GetStarted button")
	public void the_user_is_in_the_home_page_of_ds_algo_portal_and_click_get_started_button() {
		 
		driver = Hooks.browserSetup();
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver); 
		dataStructure_intropage = new DataStructure_IntroPage(driver);
		dsalgoportal.GetStarted();
		LoggerLoad.info("User is in DSAlgoPortal Page");
	}

	@When("user click on signin and enter valid username and valid password")
	public void user_click_on_signin_and_enter_valid_username_and_valid_password() throws InterruptedException {
		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		LoggerLoad.info("User is in HomePage");
		signinpage.loginUserName("SavvyGeeks");
		signinpage.loginUserPassword("Savvy@123");
		//signinpage.loginUser("SavvyGeeks", "Savvy@123");
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	    signinpage.loginclick();
	    LoggerLoad.info("User is in login page");
	    Thread.sleep(1000);
	}

//	@Then("user navigates to DSAlgo portal home page")
//	public void user_navigates_to_ds_algo_portal_home_page() {
//		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
//		LoggerLoad.info("User is in Home Page with valid signin");
//	}


	@When("The user clicks Get Started button below the Data structure-Introduction")
	public void the_user_clicks_get_started_button_below_the_data_structure_introduction() {
		 dataStructure_intropage.DataStructureGetStarted();
		    LoggerLoad.info("User is in DataStructure GetStarted page");
	}

	@Then("The user should land in Data structure-Introduction page")
	public void the_user_should_land_in_data_structure_introduction_page() {
		 driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/");
		    LoggerLoad.info("User is in DataStructure Introduction page");
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
		 dataStructure_intropage.time_complexclick();
	}

	@Then("The user redirected to Time Complexity of Data Structure-Introduction")
	public void the_user_redirected_to_time_complexity_of_data_structure_introduction() {
	   
		driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
		 LoggerLoad.info("User is in DataStructure Introduction - time complexity page");
		 
	}
	

	@When("The user click on Try HereButton")
	public void the_user_click_on_try_here_button() {
	    dataStructure_intropage.tryHere_click();
	    
	}

	@Then("The user should be redirecetd to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirecetd_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws InterruptedException {
	    dataStructure_intropage.Clickwrite();
	    Thread.sleep(3000);
	    dataStructure_intropage.Clickrunbutton();
	   
	    
	}
	@Then("The user see the output")
	public void the_user_see_the_output() throws InterruptedException {
		 dataStructure_intropage.Displayoutput();
		 Thread.sleep(3000);
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	   dataStructure_intropage.practiceQuestionsclick();
	  
	    
	}
	@Then("The user redirected to {string} of Data Structure-Introduction")
	public void the_user_redirected_to_of_data_structure_introduction(String string) {
		driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/practice");
	}

}
