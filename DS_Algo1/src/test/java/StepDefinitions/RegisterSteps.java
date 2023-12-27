package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import ApplicationHooks.Hooks;
import PageObjectModel.DSAlgoPortalPage;
import PageObjectModel.RegisterPage;
import PageObjectModel.SigninPage;
import PageObjectModel.homePage;
import Utilities.ExcelReader;
import Utilities.ExcelReader1;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {


	WebDriver driver;
	homePage homepage;
	ChromeOptions co;
	DSAlgoPortalPage dsalgoportal;
	RegisterPage Registerpage;
	ExcelReader reader;
	List<Map<String,String>> testData;
	String username;
	String password;
	String confirmpassword;
	String message;
	int g_rownumber;
	
	@Given("The user is in the Home page of ds-algo portal page")
	public void the_user_is_in_the_home_page_of_ds_algo_portal_page() {
		driver = Hooks.browserSetup();
		homepage = new homePage(driver);
		dsalgoportal = new DSAlgoPortalPage(driver);
		dsalgoportal.GetStarted();
		Registerpage = new RegisterPage(driver);
		LoggerLoad.info("User is in DSAlgo Portal Home Page");
	}

	@When("The user clicks on the Register link")
	public void the_user_clicks_on_the_register_link() throws InterruptedException {
		homepage.DataStructure_Register();
		Thread.sleep(1000);
		LoggerLoad.info("User is in Register Link");

	}

	@Then("The user is taken to the registration page")
	public void the_user_is_taken_to_the_registration_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/register");
		LoggerLoad.info("User is in Registration Page");

	}

	@When("The user fills the form from given sheetname {string} and rownumber {int}")
	public void the_user_fills_the_form_from_given_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		reader = new ExcelReader();
			testData = 
					reader.getData("C:\\Viji\\workspace\\DS_Algo1\\src\\test\\resources\\Exceldata\\Register.xlsx", sheetname);
			username = testData.get(rownumber).get("UserName");
			password = testData.get(rownumber).get("Password");
			confirmpassword = testData.get(rownumber).get("ConfirmPassword");
			//message = testData.get(rownumber).get("Status");
			g_rownumber  = rownumber;
			//Registerpage.Register(username, password, confirmpassword, message);
			Registerpage.Register(username, password, confirmpassword);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
	
	@When("clicks the register button")
	public void clicks_the_register_button() throws InterruptedException {
		Registerpage.btn_RegisterClick();
		Thread.sleep(1000);

	}

	@Then("Verify the register {string}")
	public void verify_the_register(String string) {
		String message = testData.get(g_rownumber).get("Status");
		if (string.equalsIgnoreCase("Please fill out this field")) {
			System.out.println("The actual message is"+string);
			Assert.assertEquals(Registerpage.errorMessage_Registration(string), string);
			LoggerLoad.warn("Please fill out this field");
	     }
	     else if (string.equalsIgnoreCase("password_mismatch:The two password fields didn’t match")) {
	    	 System.out.println("The actual message is"+string);
	    	assertEquals(Registerpage.ErrorMsgRegister(), string);
	    	LoggerLoad.warn("password_mismatch:The two password fields didn’t match");
	     }
	     else if (string.equalsIgnoreCase("New Account Created. You are logged in as <username>")) {
	    	 System.out.println("The actual message is"+string);
	    	 assertEquals(Registerpage.validRegistrationMessage(), string);
	    	LoggerLoad.info("Logged in");
	     }
		
	
	}
	
	@Given("The user is in registration page")
	public void the_user_is_in_registration_page() throws InterruptedException {
		homepage.DataStructure_Register();
		Thread.sleep(1000);
	}


	@When("The user clicks on login button")
	public void the_user_clicks_on_login_button() {
	   Registerpage.validlogin();
	}

	@Then("The user redirects to login page")
	public void the_user_redirects_to_login_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/login");
	}

}
