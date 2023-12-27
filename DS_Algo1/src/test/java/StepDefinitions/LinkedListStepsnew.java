package StepDefinitions;

import org.openqa.selenium.WebDriver;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.LinkedListPage;
import PageObjectModel.SigninPage;
import PageObjectModel.homePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepsnew {

	WebDriver driver;
	LinkedListPage linkedListPage;
	DSAlgoPortalPage dsalgoportal;
	SigninPage signinpage;
	homePage homepage;

	@Given("The user is on Sign in page of DS Algo portal")
	public void the_user_is_on_sign_in_page_of_ds_algo_portal() {

		driver = Hooks.browserSetup();
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		linkedListPage = new LinkedListPage(driver);
		dsalgoportal.GetStarted();
		LoggerLoad.info("User is in DSAlgoPortal sign in Page");
	}
	@When("The user enters valid Username {string} and Password {string}")
	public void the_user_enters_valid_username_and_password(String string, String string2) throws InterruptedException {
		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		LoggerLoad.info("User is in HomePage");
		signinpage.loginUserName("SavvyGeeks");
		signinpage.loginUserPassword("Savvy@123");
		LoggerLoad.info("The user enters valid username and password");

	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		signinpage.loginclick();
		LoggerLoad.info("User is in logged in page");

	}
	
	@Then("clicks on the Get Started button below Linkedlist")
	public void clicks_on_the_get_started_button_below_linkedlist() throws InterruptedException {
		linkedListPage.linkedlist_click();
		Thread.sleep(1000);
		LoggerLoad.info("The user is in  linkedlist Get Started page");
	}

	@Then("The user is redirected to Linked List page")
	public void the_user_is_redirected_to_linked_list_page() {
		//linkedListPage.linkedlistPage_click();
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		LoggerLoad.info("User is in LinkedList page");

	}

	@Given("The user clicks Introduction link from linked list page")
	public void the_user_clicks_introduction_link_from_linked_list_page() {
		linkedListPage.introdution_click();
	
	}

	@When("The user is redirected to Introduction page")
	public void the_user_is_redirected_to_introduction_page() {
		linkedListPage.introductionpage_click();
		LoggerLoad.info("User is in introduction page");
	}

	@When("The user clicks the Try here link")
	public void the_user_clicks_the_try_here_link() {
		linkedListPage.tryHere_click();
		LoggerLoad.info("The user clicks try Here button");
	}

	@Then("The user is redirected to Try Editor page")
	public void the_user_is_redirected_to_try_editor_page() {

		linkedListPage.tryherepage_click();
	}

	@Then("The user enters some code in Try Editor and run the test")
	public void the_user_enters_some_code_in_try_editor_and_run_the_test() throws InterruptedException {

		linkedListPage.Clickwrite();
		Thread.sleep(3000);
		linkedListPage.runClick();
	}

	@Then("The user sees the output")
	public void the_user_sees_the_output() {
		linkedListPage.outputText();

	}

	@When("The user clicks Creating Linked List link")
	public void the_user_clicks_creating_linked_list_link() {
		linkedListPage.creating_linkedlist_click();
		

	}

	@Then("The user is redirected to CreatingaLinkedList page")
	public void the_user_is_redirected_to_creatinga_linked_list_page() {
		linkedListPage.creatinglink_page_click();
		LoggerLoad.info("The user is in creating linked list");
	}

	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
		linkedListPage.types_linkedlist_click();
		LoggerLoad.info("The user is in types of linked list");
	}

	@Then("The user is redirected to TypesofLinkedlist page")
	public void the_user_is_redirected_to_typesof_linkedlist_page() {
		linkedListPage.typeslinked_page_click();

	}

	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		linkedListPage.implement_linkedlist_click();
		
	}

	@Then("The user is redirected to ImplementLinkedListinPython page")
	public void the_user_is_redirected_to_implement_linked_listin_python_page() {
		linkedListPage.implementlinked_page_click();
		LoggerLoad.info("The user is in implement linked list");
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {
		linkedListPage.traversal_click();
		
	}

	@Then("The user is redirected to Traversal page")
	public void the_user_is_redirected_to_traversal_page() {
		linkedListPage.traversal_page_click();
		LoggerLoad.info("The user is in traversal linked list");
	}

	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {
		linkedListPage.insertion_click();

	}

//	@Then("The user is redirected to {string} page")
//	public void the_user_is_redirected_to_page(String string) {
//		linkedListPage.insertion_page_click();
//		LoggerLoad.info("The user is in insertion linked list");
//	}
	@Then("The user is redirected to Insertion page")
	public void the_user_is_redirected_to_insertion_page() {
		linkedListPage.insertion_page_click();
		LoggerLoad.info("The user is in insertion linked list");
	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		linkedListPage.deletion_click();
		
	}
	
	@Then("The user is redirected to Deletion page")
	public void the_user_is_redirected_to_deletion_page() {
		linkedListPage.deletion_page_click();
		LoggerLoad.info("The user is in deletion linked list");
	}
	
	@Given("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
	 
		linkedListPage.introdution_click();
		LoggerLoad.info("The user is in introduction linked list");
	}
	@Then("The user is redirected to Introduction page of linked list")
	public void the_user_is_redirected_to_introduction_page_of_linked_list() {
		linkedListPage.introductionpage_click();
	}
	@When("The user clicks the Practice Questions link")
	public void the_user_clicks_the_practice_questions_link() {

		linkedListPage.practiceQuestionsclick();
		
	}

	@Then("The user is redirected to PracticeQuestions page")
	public void the_user_is_redirected_to_practice_questions_page() {
	   driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/practice");
	   LoggerLoad.info("The user is in practice question linked list");
	}

}
