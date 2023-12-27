package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import ApplicationHooks.Hooks;


public class DSAlgoPortalPage {

	WebDriver driver;
	 
	
	//By btn_GetStarted = By.xpath("/html/body/div[1]/div/div/a/button");
	
	
	
	public DSAlgoPortalPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	@SuppressWarnings("null")
	public void GetStarted() {
				
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	}

	
}
