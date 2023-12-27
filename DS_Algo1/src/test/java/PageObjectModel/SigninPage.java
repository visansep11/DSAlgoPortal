package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.Message;
import org.testng.Assert;

import Utilities.LoggerLoad;

public class SigninPage {
	
	static WebDriver driver;
	By signin = By.linkText("Sign in");
	By register = By.xpath("//a[text()='Register']");
	By txt_username = By.id("id_username");
	By txt_password = By.id("id_password");
	By txt_Login = By.xpath("//input[@value=\"Login\"]");;
	//By txt_Login = By.cssSelector("input[value='Login']");
	By loginPageCheck = By.partialLinkText("SavvyGee");
	By loginSuccessMsg = By.cssSelector("div[role='alert']");
	By loginerror_Msg = By.xpath("//*[@class='alert alert-primary']");
	By signout = By.cssSelector("a[href='/logout']");
	By msg_signout = By.cssSelector("div[role='alert']");
	By register_login = By.cssSelector("div[class='col-sm'] a");
	
	
	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}
	public void loginUserName(String Username) {
		driver.findElement(txt_username).sendKeys(Username);
	}
	public void loginUserPassword(String Password) {
		driver.findElement(txt_password).sendKeys(Password);
	}
	
	
	public void loginclick() {
		driver.findElement(txt_Login).click();
		
	}
	
	public void loginUser(String username, String password) {
			
		driver.findElement(txt_username).clear();
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).clear();
		driver.findElement(txt_password).sendKeys(password);
		loginclick();
		
	}
		
	public String errorMessage(String activeelementerr) {
	
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		Assert.assertEquals(messageStr, activeelementerr);
		return messageStr;
									
		
	}
	
	public String invalidMessage() {
		
		String message = (driver.findElement(loginerror_Msg)).getText();
		System.out.println("invalidMessage" +message);
		return message;
	}
	
	public String validMessage() {
		String loginmsg;	
		driver.findElement(loginPageCheck).isDisplayed();
		loginmsg = driver.findElement(loginSuccessMsg).getText().toString();
		System.out.println("The message is" +loginmsg);
		assertEquals(loginmsg, "You are logged in");
		//driver.getPageSource();
		return loginmsg;
		
	}

	public void signOut() {
		driver.findElement(signout).click();
	}
	
	public void signOut_Msg() {
		String logoutmsg= null;
		logoutmsg = driver.findElement(msg_signout).getText().toString();
		System.out.println("The message is" +logoutmsg );
	}
	
	public String getpagetitle() {
		driver.findElement(loginPageCheck).isDisplayed();
		String title = driver.getTitle();
		System.out.println("The page title is" +title);
		//assert.assertEquals(title, "NumpyNinja");
		return title;
		
	}
	
	public void signinHomepage() {
		getpagetitle();
		driver.findElement(loginPageCheck).isDisplayed();
		System.out.println("The user is in homepage with valid login");
	}
}
	
	

