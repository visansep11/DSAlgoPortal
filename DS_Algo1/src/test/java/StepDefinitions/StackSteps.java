package StepDefinitions;

import org.openqa.selenium.WebDriver;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.Graphpage;
import PageObjectModel.LinkedListPage;
import PageObjectModel.SigninPage;
import PageObjectModel.StackPage;
import PageObjectModel.homePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSteps {
	WebDriver driver;
	DSAlgoPortalPage dsalgoportal;
	SigninPage signinpage;
	homePage homepage;
	LinkedListPage linkedListPage;
	StackPage stackPage;

	@Given("The user is on Signinpage of DSAlgo Portal")
	public void the_user_is_on_signinpage_of_ds_algo_portal() {

		driver = Hooks.browserSetup();
		stackPage = new StackPage(driver);
		linkedListPage = new LinkedListPage(driver);
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		dsalgoportal.GetStarted();
		LoggerLoad.info("User is in DSAlgoPortal sign in Page");
	}

	@When("The User enter valid Username {string} and password {string}")
	public void the_user_enter_valid_username_and_password(String string, String string2) throws InterruptedException {

		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		LoggerLoad.info("User is in HomePage");
		signinpage.loginUserName("SavvyGeeks");
		signinpage.loginUserPassword("Savvy@123");
		LoggerLoad.info("The user enters valid username and password");
	}

	@Then("User clicks login Button")
	public void user_clicks_login_button() {
		signinpage.loginclick();
		LoggerLoad.info("User is in logged in page");

	}

	@Then("The User is redirected to the Homepage")
	public void the_user_is_redirected_to_the_homepage() {
		System.out.println("The User is in Homepage with valid signin");

	}

	@Then("clicks on the Get Started button below Stack")
	public void clicks_on_the_get_started_button_below_stack() throws InterruptedException {
		stackPage.Stack_StartedClick();
		Thread.sleep(1000);
		LoggerLoad.info("The user is in  Stack Get Started page");

	}

	@Then("The user is redirected Stack page")
	public void the_user_is_redirected_stack_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
		LoggerLoad.info("User is in Stack page");

	}

	@Given("The user clicks Operations in Stack from stack Page")
	public void the_user_clicks_operations_in_stack_from_stack_page() {
		stackPage.Operations_StackClick();

	}

	@When("The user is redirected to Operations in Stack page")
	public void the_user_is_redirected_to_operations_in_stack_page() {
		stackPage.Operations_StackPage_click();
		LoggerLoad.info("User is in Operations in Stack page");

	}

	@When("The user clicks Tryhere link of Stack")
	public void the_user_clicks_tryhere_link_of_stack() {
		linkedListPage.tryHere_click();
		LoggerLoad.info("The user clicks try Here button");

	}

	@Then("The user is redirected to Try Editor page of Satck")
	public void the_user_is_redirected_to_try_editor_page_of_satck() {
		linkedListPage.tryherepage_click();

	}

	@Then("The user enters code in TryEditor of Stack and run the test")
	public void the_user_enters_code_in_try_editor_of_stack_and_run_the_test() throws InterruptedException {

		linkedListPage.Clickwrite();
		Thread.sleep(3000);
		linkedListPage.runClick();
	}

	@Then("The user see the output of Stack try Editor")
	public void the_user_see_the_output_of_stack_try_editor() {
		linkedListPage.outputText();

	}

	@Given("The user clicks Implementation from Stack Page")
	public void the_user_clicks_implementation_from_stack_page() {
		stackPage.ImplementationClick();

	}

	@When("The user is redirected to Implementation Representation page")
	public void the_user_is_redirected_to_implementation_representation_page() {
		stackPage.Implementation_Page_click();
		LoggerLoad.info("The user is in Implementation page");

	}

	@Given("The user clicks Applications from Stack Page")
	public void the_user_clicks_applications_from_stack_page() {
		stackPage.ApplicationsClick();

	}

	@When("The user is redirected to Applications Representation page")
	public void the_user_is_redirected_to_applications_representation_page() {

		stackPage.Applications_Page_click();
		LoggerLoad.info("The user is in Applications page");
	}

	@Given("The user is in Stack page after logged in")
	public void the_user_is_in_stack_page_after_logged_in() {
		System.out.println("The User is in Stack Page after logged in");

	}

	@When("The user clicks Operations in Stack")
	public void the_user_clicks_operations_in_stack() {
		stackPage.Operations_StackClick();

	}

	@When("The user clicks the Practice Questions link in Stack page")
	public void the_user_clicks_the_practice_questions_link_in_stack_page() {

		linkedListPage.practiceQuestionsclick();
	}

	@Then("The user is redirected to PracticeQuestions page of Stack")
	public void the_user_is_redirected_to_practice_questions_page_of_stack() throws InterruptedException {
		driver.navigate().to("https://dsportalapp.herokuapp.com/stack/practice");
		Thread.sleep(2000);
		LoggerLoad.info("The user is in practice question of Stack");

	}

}
