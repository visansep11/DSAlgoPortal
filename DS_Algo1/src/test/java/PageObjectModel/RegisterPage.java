package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterPage {

	static WebDriver driver;
	By txt_Username = By.id("id_username");
	By txt_Password = By.id("id_password1");
	By txt_ConfirmPassword = By.id("id_password2");
	By btn_Regsiter = By.cssSelector("input[value='Register']");
	By Register_ErrorMsg = By.cssSelector("div[role='alert']");
	By Register_SuccessMsg = By.cssSelector("div[role='alert']");
	By Register_Login = By.cssSelector("div[class='col-sm'] a");
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	public void btn_RegisterClick() {
		driver.findElement(btn_Regsiter).click();
	}


	public void Register(String UserName, String Password, String ConfirmPassword) {
		driver.findElement(txt_Username).clear();
		driver.findElement(txt_Username).sendKeys(UserName);
		driver.findElement(txt_Password).clear();
		driver.findElement(txt_Password).sendKeys(Password);
		driver.findElement(txt_ConfirmPassword).clear();
		driver.findElement(txt_ConfirmPassword).sendKeys(ConfirmPassword);
		btn_RegisterClick();
		
	}
	
	public String errorMessage_Registration(String activeelementerr) {
		
		
			WebElement activeElement = driver.switchTo().activeElement();
			String messageStr = activeElement.getAttribute("validationMessage");
			System.out.println("Actual message appeared on screen: " + messageStr);
			Assert.assertEquals(messageStr, activeelementerr);
			return messageStr;
	
									
		
	}

	
	
	public String ErrorMsgRegister() {
		
		String errorMsg = driver.findElement(Register_ErrorMsg).getText();
		System.out.println("password_mismatch:The two password fields didn’t match" +errorMsg);
		return errorMsg; 
		
	}
	
	public String validRegistrationMessage() {
		String successmsg;	
		//driver.findElement(loginPageCheck).isDisplayed();
		successmsg = driver.findElement(Register_SuccessMsg).getText();
		System.out.println("The message is" +successmsg);
		return successmsg;
		
	}

	public void validlogin() {
		driver.findElement(Register_Login).click();
	}
	
}

	