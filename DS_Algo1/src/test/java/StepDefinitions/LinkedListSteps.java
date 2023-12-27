//package StepDefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import ApplicationHooks.Hooks;
//import PageObjectModel.DSAlgoPortalPage;
//import PageObjectModel.LinkedListPage;
//import PageObjectModel.ReusuablePage;
//import PageObjectModel.SigninPage;
//import PageObjectModel.homePage;
//import Utilities.LoggerLoad;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LinkedListSteps {
//	
//	WebDriver driver;
//	//ReusuablePage reusuablePage;
//	LinkedListPage linkedListPage;
//	DSAlgoPortalPage dsalgoportal;
//	SigninPage signinpage;
//	homePage homepage;
//	
//	@Given("The user is on Signin page of DS Algo portal")
//	public void the_user_is_on_signin_page_of_ds_algo_portal() {
//		driver = Hooks.browserSetup();
//		signinpage = new SigninPage(driver);
//		homepage = new homePage(driver);
//		dsalgoportal = new DSAlgoPortalPage(driver); 
//		//reusuablePage = new ReusuablePage(driver);
//		dsalgoportal.GetStarted();
//		LoggerLoad.info("User is in DSAlgoPortal sign in Page");
//	    
//	}
//
//	@When("The user enters valid username {string} and password {string}")
//	public void the_user_enters_valid_username_and_password(String string, String string2) throws InterruptedException {
//		homepage.DataStructure_Signin();
//		Thread.sleep(1000);
//		LoggerLoad.info("User is in HomePage");
//		signinpage.loginUserName("SavvyGeeks");
//	   signinpage.loginUserPassword("Savvy@123");
//	   LoggerLoad.info("The user enters " + string + " and " + string2);
//	}
//
//	@When("The user click on login button")
//	public void the_user_click_on_login_button() {
//	   signinpage.loginclick();
//	   LoggerLoad.info("User is in logged in page");
//	}
//
////	@Then("The user is redirected to the homepage")
////	public void the_user_is_redirected_to_the_homepage() {
////		//signinpage.validMessage();
////		signinpage.getpagetitle();
////		LoggerLoad.info("The user gets pagetitle");
////	    
////	}
//	@Given("The user is on the home page after logged in")
//	public void the_user_is_on_the_home_page_after_logged_in() throws InterruptedException {
//		signinpage.signinHomepage();
//		Thread.sleep(1000);
//		LoggerLoad.info("The User is in Homepage after logged in");
//	}
//
//	@When("The user is redirected to {string}")
//	public void the_user_is_redirected_to(String string) {
//	   reusuablePage.reusableMethod(string);
//	   LoggerLoad.info("The user is on " + string + " after logged in");
//	    
//	}
//	@Given("The user is in {string} page after logged in")
//	public void the_user_is_in_page_after_logged_in(String string) {
//		
//		reusuablePage = new ReusuablePage(driver);
//		linkedListPage = new LinkedListPage(driver);
//		reusuablePage.reusableMethod(string);
//		LoggerLoad.info("The user is in " + string);
//		 
//	}
//
//	@When("The user clicks on the Get Started button below Linkedlist")
//	public void the_user_clicks_on_the_get_started_button_below_linkedlist() {
//	   linkedListPage.linkedlist_click();
//	    
//	}
//
//
//	@When("The user clicks Introduction link")
//	public void the_user_clicks_introduction_link() {
//	   linkedListPage.introdution_click();
//	    
//	}
//
//	@Then("The user is redirected to {string} page")
//	public void the_user_is_redirected_to_page(String string) {
//		reusuablePage.reusableMethod(string);
//		LoggerLoad.info("The user is in " + string);
//	    
//	}
//
//	@When("The user clicks the Try here link")
//	public void the_user_clicks_the_try_here_link() {
//	   linkedListPage.tryHere_click();
//	    
//	}
//	
//	@Then("The user enters some code in Try Editor and run the test")
//	public void the_user_enters_some_code_in_try_editor_and_run_the_test() {
//	  linkedListPage.Clickwrite();
//	  linkedListPage.runClick();
//	}
//
//	@Then("The user sees the output")
//	public void the_user_sees_the_output() {
//	    linkedListPage.outputText();
//	}
//
//	@When("The user clicks Creating Linked List link")
//	public void the_user_clicks_creating_linked_list_link() {
//	   linkedListPage.creating_linkedlist_click();
//	   
//	    
//	}
//
//	@When("The user clicks Types of Linked List link")
//	public void the_user_clicks_types_of_linked_list_link() {
//	   linkedListPage.linkedlist_click();
//	    
//	}
//
//	@When("The user clicks Implement Linked List in Python link")
//	public void the_user_clicks_implement_linked_list_in_python_link() {
//	   linkedListPage.implement_linkedlist_click();
//	    
//	}
//
//	@When("The user clicks Traversal link")
//	public void the_user_clicks_traversal_link() {
//	   linkedListPage.traversal_click();
//	    
//	}
//
//	@When("The user clicks Insertion link")
//	public void the_user_clicks_insertion_link() {
//	   linkedListPage.insertion_click();
//	    
//	}
//
//	@When("The user clicks Deletion link")
//	public void the_user_clicks_deletion_link() {
//	   linkedListPage.deletion_click();
//	    
//	}
//
//	@When("The user clicks the Practice Questions link")
//	public void the_user_clicks_the_practice_questions_link() {
//	   linkedListPage.practiceQuestionsclick();
//	    
//	}
//
//}
