package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DataStructure_IntroPage {
	static WebDriver driver;
	By btn_GetStarted = By.cssSelector("a[href='data-structures-introduction']");
	By timecomplexity = By.linkText("Time Complexity");
	By practiceQuestions = By.linkText("Practice Questions");
	By tryhere = By.linkText("Try here>>>");
	By txt_write = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	//By txt_write = By.cssSelector(".CodeMirror-scroll");
	By btn_Run = By.cssSelector("button[type='button']");
	By txt_output = By.xpath("//pre[@id='output']");
			//By.id("output");
	
	public DataStructure_IntroPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DataStructureGetStarted() {
		driver.findElement(btn_GetStarted).click();
		
}
	public void time_complexclick() {

        driver.findElement(timecomplexity).click();

    }
	
	public void tryHere_click() {

        driver.findElement(tryhere).click();

    }
	
	public void Clickwrite() {
        driver.findElement(txt_write).sendKeys("print 'Hello'");
    }

    public void Clickrunbutton() {
        driver.findElement(btn_Run).click();
    }

  
    public void Displayoutput() {
        String display = driver.findElement(txt_output).getText();
        System.out.println("The text editor message is " +display);
    }
    
    public void practiceQuestionsclick() {
    	driver.findElement(practiceQuestions).click();
    }
    
}
