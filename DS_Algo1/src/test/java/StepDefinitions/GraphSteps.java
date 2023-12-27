package StepDefinitions;

import org.openqa.selenium.WebDriver;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.Graphpage;
import PageObjectModel.LinkedListPage;
import PageObjectModel.SigninPage;
import PageObjectModel.homePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {

	WebDriver driver;
	DSAlgoPortalPage dsalgoportal;
	SigninPage signinpage;
	homePage homepage;
	LinkedListPage linkedListPage;
	Graphpage graphpage;

	@Given("The user is on Signinpage of DSAlgo portal")
	public void the_user_is_on_signinpage_of_ds_algo_portal() {
		driver = Hooks.browserSetup();
		graphpage = new Graphpage(driver);
		linkedListPage = new LinkedListPage(driver);
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		dsalgoportal.GetStarted();
		LoggerLoad.info("User is in DSAlgoPortal sign in Page");

	}

	@When("The User enter valid Username {string} and Password {string}")
	public void the_user_enter_valid_username_and_password(String string, String string2) throws InterruptedException {
		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		LoggerLoad.info("User is in HomePage");
		signinpage.loginUserName("SavvyGeeks");
		signinpage.loginUserPassword("Savvy@123");
		LoggerLoad.info("The user enters valid username and password");
	}

	@Then("User clicks login button")
	public void user_clicks_login_button() {
		signinpage.loginclick();
		LoggerLoad.info("User is in logged in page");

	}

	@Then("The User is redirected to the homepage")
	public void the_user_is_redirected_to_the_homepage() {
		System.out.println("The User is in Homepage with valid signin");

	}
	@Then("clicks on the Get Started button below Graph")
	public void clicks_on_the_get_started_button_below_graph() throws InterruptedException {

		graphpage.Graph_StartedClick();
		Thread.sleep(1000);
		LoggerLoad.info("The user is in  Graph Get Started page");
	}

	@Then("The user is redirected Graph page")
	public void the_user_is_redirected_graph_page() {

		driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
		LoggerLoad.info("User is in graph page");
	}

	@Given("The user clicks Graph link from Graph Page")
	public void the_user_clicks_graph_link_from_graph_page() {
		graphpage.Graph_LinkClick();

	}

	@When("The user is redirected to Graph page")
	public void the_user_is_redirected_to_graph_page() {
		graphpage.Graph_LinkPage_click();
		LoggerLoad.info("User is in inner page of graph");

	}

	@When("The user clicks Tryhere link")
	public void the_user_clicks_tryhere_link() {
		linkedListPage.tryHere_click();
		LoggerLoad.info("The user clicks try Here button");
	}

	@Then("The user is redirected to Try Editor page of Graph")
	public void the_user_is_redirected_to_try_editor_page_of_graph() {
		linkedListPage.tryherepage_click();

	}

	@Then("The user enters code in TryEditor and run the test")
	public void the_user_enters_code_in_try_editor_and_run_the_test() throws InterruptedException {

		linkedListPage.Clickwrite();
		Thread.sleep(3000);
		linkedListPage.runClick();
	}

	@Then("The user see the output of Graph try Editor")
	public void the_user_see_the_output_of_graph_try_editor() {
		linkedListPage.outputText();

	}

	@Given("The user clicks Graph Representations link from Graph Page")
	public void the_user_clicks_graph_representations_link_from_graph_page() {
		graphpage.Graph_RepClick();
	}


	@When("The user is redirected to Graph Representation page")
	public void the_user_is_redirected_to_graph_representation_page() {
		graphpage.Graph_RepPage_click();
		LoggerLoad.info("The user is in Garph Representation page");

	}

	@Given("The user is in Graph page after logged in")
	public void the_user_is_in_graph_page_after_logged_in() {

		System.out.println("The User is in Graph Page after logged in");
	}

	@When("The user clicks Graphlink from Graph Page")
	public void the_user_clicks_graph_link_from_graph_page1() {
		graphpage.Graph_LinkClick();

	}

	@When("The user clicks the Practice Questions link in Graph page")
	public void the_user_clicks_the_practice_questions_link_in_graph_page() {
		linkedListPage.practiceQuestionsclick();

	}

	@Then("The user is redirected to PracticeQuestions page of Graph")
	public void the_user_is_redirected_to_practice_questions_page_of_graph() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/graph/practice");
		LoggerLoad.info("The user is in practice question of Graph");

	}




}
