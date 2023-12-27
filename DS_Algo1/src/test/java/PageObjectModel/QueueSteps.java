package PageObjectModel;

import org.openqa.selenium.WebDriver;

import ApplicationHooks.Hooks;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSteps {
	WebDriver driver;
	DSAlgoPortalPage dsalgoportal;
	SigninPage signinpage;
	homePage homepage;
	LinkedListPage linkedListPage;
	QueuePage queuePage;
	
	@Given("The User is on Signinpage of DSAlgo portal")
	public void the_user_is_on_signinpage_of_ds_algo_portal() {
		driver = Hooks.browserSetup();
		queuePage = new QueuePage(driver);
		linkedListPage = new LinkedListPage(driver);
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		dsalgoportal.GetStarted();
		LoggerLoad.info("User is in DSAlgoPortal sign in Page");

	}

	@When("The User enters valid Username {string} and Password {string}")
	public void the_user_enters_valid_username_and_password(String string, String string2) throws InterruptedException {
		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		LoggerLoad.info("User is in HomePage");
		signinpage.loginUserName("SavvyGeeks");
		signinpage.loginUserPassword("Savvy@123");
		LoggerLoad.info("The user enters valid username and password");

	}

	@Then("User clicks Login button")
	public void user_clicks_login_button() {
		signinpage.loginclick();
		LoggerLoad.info("User is in logged in page");

	}

	@Then("The User is Redirected to the homepage")
	public void the_user_is_redirected_to_the_homepage() {
		System.out.println("The User is in Homepage with valid signin");

	}

	@Then("clicks on the Get Started button below Queue")
	public void clicks_on_the_get_started_button_below_queue() throws InterruptedException {
		queuePage.Queue_StartedClick();
		Thread.sleep(1000);
		LoggerLoad.info("The user is in  Queue Get Started page");

	}

	@Then("The user is redirected Queue page")
	public void the_user_is_redirected_queue_page() {

		driver.navigate().to("https://dsportalapp.herokuapp.com/queue/");
		LoggerLoad.info("User is in Queue page");
	}

	@Given("The user clicks Implementation of Queue in Python from Queue Page")
	public void the_user_clicks_implementation_of_queue_in_python_from_queue_page() {
		queuePage.Implementation_QueueClick();

	}

	@When("The user is redirected to Implementation of Queue in Python page")
	public void the_user_is_redirected_to_implementation_of_queue_in_python_page() {
		queuePage.Implementation_QueuePage_click();
		LoggerLoad.info("User is in Implementation of Queue in Python page");

	}

	@When("The user clicks Tryhere link of Queue")
	public void the_user_clicks_tryhere_link_of_queue() {
		linkedListPage.tryHere_click();
		LoggerLoad.info("The user clicks try Here button");

	}

	@Then("The user is redirected to Try Editor page of Queue")
	public void the_user_is_redirected_to_try_editor_page_of_queue() {
		linkedListPage.tryherepage_click();

	}

	@Then("The user enters code in TryEditor of Queue Page and run the test")
	public void the_user_enters_code_in_try_editor_of_queue_page_and_run_the_test() throws InterruptedException {

		linkedListPage.Clickwrite();
		Thread.sleep(3000);
		linkedListPage.runClick();
	}

	@Then("The user see the output of Queue try Editor")
	public void the_user_see_the_output_of_queue_try_editor() {
		linkedListPage.outputText();

	}

	@Given("The user clicks Implementation using collections.deque link from queue page")
	public void the_user_clicks_implementation_using_collections_deque_link_from_queue_page() {

		queuePage.Implementation_CollectionsClick();
	}

	@When("The user is redirected to Implementation using collections.deque page")
	public void the_user_is_redirected_to_implementation_using_collections_deque_page() throws InterruptedException {
		queuePage.Implementation_CollectionsPage_click();
		Thread.sleep(1000);
		LoggerLoad.info("The user is in Implementation using collections page");

	}

	@Given("The user clicks Implementation using array link from queue page")
	public void the_user_clicks_implementation_using_array_link_from_queue_page() {

		queuePage.Implementation_ArrayClick();
	}

	@When("The user is redirected to Implementation using array page")
	public void the_user_is_redirected_to_implementation_using_array_page() {
		queuePage.Implementation_ArrayPage_click();
		LoggerLoad.info("The user is in Implementation using array page");

	}

	@Given("The user clicks Queue operations link from queue page")
	public void the_user_clicks_queue_operations_link_from_queue_page() {
		queuePage.Queue_Operations_Click();

	}

	@When("The user is redirected to Queue operations page")
	public void the_user_is_redirected_to_queue_operations_page() {
		queuePage.Queue_OperationsPage_click();
		LoggerLoad.info("The user is in Queue operations page");
	}

	@Given("The user is in Queue page after logged in")
	public void the_user_is_in_queue_page_after_logged_in() {
		System.out.println("The User is in Queue Page after logged in");

	}

	@When("The user clicks Implementation of Queue in Python")
	public void the_user_clicks_implementation_of_queue_in_python() {
		queuePage.Implementation_QueueClick();

	}

	@When("The user clicks the Practice Questions link in Queue page")
	public void the_user_clicks_the_practice_questions_link_in_queue_page() {
		queuePage.practiceQuestionsclick();

	}

	@Then("The user is redirected to PracticeQuestions page of Queue")
	public void the_user_is_redirected_to_practice_questions_page_of_queue() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/queue/practice");
		LoggerLoad.info("The user is in practice question of Graph");

	}

}
