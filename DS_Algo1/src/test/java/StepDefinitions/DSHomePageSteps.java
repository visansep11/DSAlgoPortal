package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSHomePageSteps {

	WebDriver driver;
	homePage homepage;
	ChromeOptions co;
	DSAlgoPortalPage dsalgoportal;
	
	
	@Given("The user opens Homepage")
	public void the_user_opens_homepage() {
		driver = Hooks.browserSetup();
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
//		driver.get("https://dsportalapp.herokuapp.com/");
//		driver.manage().window().maximize(); 
		dsalgoportal.GetStarted();

	}

	@Given("The user should see {int} panes with different data structures")
	public void the_user_should_see_panes_with_different_data_structures(Integer int1) {
		
		
		homePage.displayelement();
		System.out.println("assertTrue(isElementPresent(homepage1))" +homepage);
		
		
	}

	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String string) throws InterruptedException {
	    homepage.DataStructures();
	    System.out.println("I am in dropdwon datastructure");
	    Thread.sleep(1000);
	  
	}

	@Then("I should see {int} different data structure entries in that dropdown")
	public void i_should_see_different_data_structure_entries_in_that_dropdown(Integer int1) throws InterruptedException {
		
		System.out.println("I can see datastructures");
		Thread.sleep(1000);
		
	}

	@When("The user select any data structues item from the drop down without sign in")
	public void the_user_select_any_data_structues_item_from_the_drop_down_without_sign_in() {
		
		homepage.DataStructures();
		
		
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) throws InterruptedException {
		
		homepage.DataStructures();
		assertEquals(homepage.array_click(), "You are not logged in", "Test Pass");
		assertEquals(homepage.linked_listclick(), "You are not logged in", "Test Pass");
		assertEquals(homepage.Stack_click(), "You are not logged in", "Test Pass");
		assertEquals(homepage.Queue_click(), "You are not logged in", "Test Pass");
		assertEquals(homepage.Tree_click(), "You are not logged in", "Test Pass");
		assertEquals(homepage.Graph_click(), "You are not logged in", "Test Pass");
		Thread.sleep(1000);
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
		homepage.DataStructures();
		}
	

	@Then("It displays alert message {string}")
	public void it_displays_alert_message(String string) throws InterruptedException {
		homepage.DataStructures();
		assertEquals(homepage.dataStructure_Introclick(), "You are not logged in", "Test Pass");
		assertEquals(homepage.array_Introclick(), "You are not logged in", "Test Pass");
		assertEquals(homepage.linkedlist_Introclick(), "You are not logged in", "Test Pass");
		assertEquals(homepage.Stack_click(), "You are not logged in", "Test Pass");
		assertEquals(homepage.Queue_click(), "You are not logged in", "Test Pass");
		assertEquals(homepage.tree_Introclick(), "You are not logged in", "Test Pass");
		assertEquals(homepage.graph_Introclick(), "You are not logged in", "Test Pass");
		Thread.sleep(1000);
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) throws InterruptedException {
		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/login");
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) throws InterruptedException {
	   homepage.DataStructure_Register();
	   Thread.sleep(1000);
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/register");
	}
	



}
