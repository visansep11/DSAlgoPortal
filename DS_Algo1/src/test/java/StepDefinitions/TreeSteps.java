package StepDefinitions;

import org.openqa.selenium.WebDriver;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.LinkedListPage;
import PageObjectModel.SigninPage;
import PageObjectModel.TreePage;
import PageObjectModel.homePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSteps {

	WebDriver driver;
	TreePage treePage;
	DSAlgoPortalPage dsalgoportal;
	SigninPage signinpage;
	homePage homepage;
	LinkedListPage linkedListPage;

	@Given("The user is on Signin page of DSAlgo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {

		driver = Hooks.browserSetup();
		signinpage = new SigninPage(driver);
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		treePage = new TreePage(driver);
		linkedListPage = new LinkedListPage(driver);
		dsalgoportal.GetStarted();
		LoggerLoad.info("User is in DSAlgoPortal sign in Page");
	}

	@When("The user enter valid Username {string} and Password {string}")
	public void the_user_enter_valid_username_and_password(String string, String string2) throws InterruptedException {

		homepage.DataStructure_Signin();
		Thread.sleep(1000);
		LoggerLoad.info("User is in HomePage");
		signinpage.loginUserName("SavvyGeeks");
		signinpage.loginUserPassword("Savvy@123");
		LoggerLoad.info("The user enters valid username and password");
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {

		signinpage.loginclick();
		LoggerLoad.info("User is in logged in page");
	}

	@Then("The user is redirected to the homepage")
	public void the_user_is_redirected_to_the_homepage() {

		System.out.println("The User is in Homepage with valid signin");
	}

	@Then("clicks on the Get Started button below Tree")
	public void clicks_on_the_get_started_button_below_tree() throws InterruptedException {
		treePage.Tree_Page_click();
		Thread.sleep(1000);
		LoggerLoad.info("The user is in  Tree Get Started page");

	}

	@Then("The user is redirected Tree page")
	public void the_user_is_redirected_tree_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
		LoggerLoad.info("User is in Tree page");

	}

	@Given("The user clicks Overview of Trees from Tree page")
	public void the_user_clicks_overview_of_trees_from_tree_page() {
		treePage.Overview_of_Trees_click();

	}

	@When("The user is redirected to Overview of Trees page")
	public void the_user_is_redirected_to_overview_of_trees_page() {
		treePage.Overview_of_TreesPage_click();
		LoggerLoad.info("User is in Overview of Trees page");

	}

	@When("The user clicks Try here link")
	public void the_user_clicks_try_here_link() {
		linkedListPage.tryHere_click();
		LoggerLoad.info("The user clicks try Here button");

	}

	@Then("The user is redirected to Try Editor page of Tree")
	public void the_user_is_redirected_to_try_editor_page_of_tree() {

		linkedListPage.tryherepage_click();
	}

	@Then("The user enters code in Try Editor and run the test")
	public void the_user_enters_code_in_try_editor_and_run_the_test() throws InterruptedException {

		linkedListPage.Clickwrite();
		Thread.sleep(3000);
		linkedListPage.runClick();
	}

	@Then("The user see the output of Tree try Editor")
	public void the_user_see_the_output_of_tree_try_editor() {
		linkedListPage.outputText();

	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {

		treePage.Terminologies_click();
	}

	@Then("The user is redirected to Terminologies page")
	public void the_user_is_redirected_to_terminologies_page() {
		treePage.Terminologies_page_click();
		LoggerLoad.info("The user is in Terminologies page");
	}

	@When("The user clicks Types of Trees link from Tree Page")
	public void the_user_clicks_types_of_trees_link_from_tree_page() {
		treePage.Types_of_Trees_click();

	}

	@Then("The user is redirected to Types of Trees page")
	public void the_user_is_redirected_to_types_of_trees_page() {
		treePage.Types_of_TreesPage_click();
		LoggerLoad.info("The user is in Types of Trees page");
	}

	@When("The user clicks Traversals-Illustration link from Tree Page")
	public void the_user_clicks_traversals_illustration_link_from_tree_page() {
		treePage.Traversals_Illustration_click();

	}

	@Then("The user is redirected to Traversals-Illustration page")
	public void the_user_is_redirected_to_traversals_illustration_page() {
		treePage.Traversals_IllustrationPage_click();
		LoggerLoad.info("The user is in Traversals Illustratio page");
	}

	@When("The user clicks Binary trees link from Tree Page")
	public void the_user_clicks_binary_trees_link_from_tree_page() {
		treePage.Binary_Trees_click();

	}

	@Then("The user is redirected to Binary trees")
	public void the_user_is_redirected_to_binary_trees() {
		treePage.Binary_TreesPage_click();
		LoggerLoad.info("The user is in Binary Trees page");
	}

	@When("The user clicks Types of Binary trees link from Tree Page")
	public void the_user_clicks_types_of_binary_trees_link_from_tree_page() {
		treePage.Types_of_Binary_Trees_click();

	}

	@Then("The user is redirected to Types of Binary trees")
	public void the_user_is_redirected_to_types_of_binary_trees() {
		treePage.Types_of_Binary_TreesPage_click();
		LoggerLoad.info("The user is in Types of Binary trees page");

	}

	@When("The user clicks Implementation in Python link from Tree Page")
	public void the_user_clicks_implementation_in_python_link_from_tree_page() {

		treePage.Implementation_in_Python_click();
	}

	@Then("The user is redirected to Implementation in Python")
	public void the_user_is_redirected_to_implementation_in_python() {
		treePage.Implementation_in_PythonPage_click();
		LoggerLoad.info("The user is in Types of Binary trees page");

	}

	@When("The user clicks Binary Tree Traversal link from Tree Page")
	public void the_user_clicks_binary_tree_traversal_link_from_tree_page() {
		treePage.Binary_Tree_Traversals_click();

	}

	@Then("The user is redirected to Binary Tree Traversal")
	public void the_user_is_redirected_to_binary_tree_traversal() {
		treePage.Binary_Tree_TraversalsPage_click();
		LoggerLoad.info("The user is in Binary Tree Traversal page");

	}

	@When("The user clicks Implementation of Binary Trees link from Tree Page")
	public void the_user_clicks_implementation_of_binary_trees_link_from_tree_page() {
		treePage.Implementation_of_Binary_Trees_click();

	}

	@Then("The user is redirected to Implementation of Binary Trees")
	public void the_user_is_redirected_to_implementation_of_binary_trees() {
		treePage.Implementation_of_Binary_TreesPage_click();
		LoggerLoad.info("The user is in Binary Tree Traversal page");
	}

	@When("The user clicks Application of Binary Trees link from Tree Page")
	public void the_user_clicks_application_of_binary_trees_link_from_tree_page() {
		treePage.Applications_of_Binary_trees_click();

	}

	@Then("The user is redirected to Application of Binary Trees")
	public void the_user_is_redirected_to_application_of_binary_trees() {
		treePage.Applications_of_Binary_treesPage_click();
		LoggerLoad.info("The user is in Application of Binary Trees page");
	}

	@When("The user clicks Binary Search Trees link from Tree Page")
	public void the_user_clicks_binary_search_trees_link_from_tree_page() {

		treePage.Binary_Search_Trees_click();
	}

	@Then("The user is redirected to Binary Search Trees")
	public void the_user_is_redirected_to_binary_search_trees() {
		treePage.Binary_Search_TreesPage_click();
		LoggerLoad.info("The user is in Application of Binary Trees page");
	}

	@When("The user clicks Implementation of BST link from Tree Page")
	public void the_user_clicks_implementation_of_bst_link_from_tree_page() {
		treePage.Implementation_Of_BST_click();

	}

	@Then("The user is redirected to Implementation of BST")
	public void the_user_is_redirected_to_implementation_of_bst() {
		treePage.Implementation_Of_BSTPage_click();
		LoggerLoad.info("The user is in Implementation of BST page");
	}

	@Given("The user is in Tree page after logged in")
	public void the_user_is_in_tree_page_after_logged_in() {
		System.out.println("The User is in Tree Page after logged in");

	}
	@When("The user clicks on Overview of Trees")
	public void the_user_clicks_on_overview_of_trees() {
		treePage.Overview_of_Trees_click();
	}


	@When("The user clicks the Practice Questions link in tree page")
	public void the_user_clicks_the_practice_questions_link_in_tree_page() {
		linkedListPage.practiceQuestionsclick();

	}

	@Then("The user is redirected to PracticeQuestions page of tree page")
	public void the_user_is_redirected_to_practice_questions_page_of_tree_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tree/practice");
		LoggerLoad.info("The user is in practice question of Tree");


	}



}
