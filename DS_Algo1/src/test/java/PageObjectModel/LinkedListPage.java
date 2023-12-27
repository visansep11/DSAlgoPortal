package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ConfigReader;

public class LinkedListPage {
	static WebDriver driver;
	//By linkedlistbtn_GetStarted = By.cssSelector(".align-self-end.btn.btn-lg.btn-block.btn-primary[href='linked-list']");
	By linkedlistbtn_GetStarted = By.cssSelector("a[href='linked-list']");
	//By linkedlistbtn_GetStarted = By.linkText("Get Started");
	By introdution = By.linkText("Introduction");
	By creating_linkedlist = By.linkText("Creating Linked LIst");
	By types_linkedlist = By.linkText("Types of Linked List");
	By implement_linkedlist = By.linkText("Implement Linked List in Python");
	By traversal = By.linkText("Traversal");
	By insertion = By.linkText("Insertion");
	By deletion = By.linkText("Deletion");
	By textarea =By.xpath("//textarea[@id='editor']");
	By run = By.xpath("//button[text()='Run']");
	By output = By.xpath("//pre[@id='output']");
	By tryhere = By.xpath("//a[text()='Try here>>>']");
	By txt_write = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By practiceQuestions = By.linkText("Practice Questions");
	By linkedlist_Page = By.cssSelector("body > div:nth-child(2)");
	By introduction_page = By.cssSelector(".navbar.navbar-expand-md.navbar-light.bg-light");
	By tryhere_page = By.cssSelector("#answer_form");
	By creatinglink_page = By.xpath("/html[1]/body[1]");
	By typeslinked_page = By.cssSelector("body");
	By implementlinked_page = By.cssSelector("body");
	By traversal_page = By.cssSelector("body");
	By insertion_page = By.cssSelector("body");
	By deletion_page = By.cssSelector("body");
	
	
	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void linkedlist_click() {
		//driver.findElement(By.cssSelector("a[href='linked-list']")).click();
		driver.findElement(linkedlistbtn_GetStarted).click();;
	}
	public void linkedlistPage_click() {
		driver.findElement(linkedlist_Page).isDisplayed();
		System.out.println("The user is in linked list page");
	}
	public void getUrlOf(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}
	
	public void introdution_click() {
		driver.findElement(introdution).click();
	}
	
	public void introductionpage_click() {
		driver.findElement(introduction_page).isDisplayed();
		System.out.println("The user is in introduction page");
	}
	
	
	public void creating_linkedlist_click() {
		driver.findElement(creating_linkedlist).click();
	}
	
	public void typeslinked_page_click() {
		driver.findElement(typeslinked_page).isDisplayed();
		System.out.println("The user is in types of linked page");
	}
	
	public void types_linkedlist_click() {
		driver.findElement(types_linkedlist).click();
	}
	public void creatinglink_page_click() {
		driver.findElement(creatinglink_page).isDisplayed();
		System.out.println("The user is in creating link page");
	}
	public void implement_linkedlist_click() {
		driver.findElement(implement_linkedlist).click();
	}
	public void implementlinked_page_click() {
		driver.findElement(implementlinked_page).isDisplayed();
		System.out.println("The user is in implement linked page");
	}
	
	
	public void traversal_click() {
		driver.findElement(traversal).click();
	}
	public void traversal_page_click() {
		driver.findElement(traversal_page).isDisplayed();
		System.out.println("The user is in traversal page");
	}
	public void insertion_click() {
		driver.findElement(insertion).click();
	}
	public void insertion_page_click() {
		driver.findElement(insertion_page).isDisplayed();
		System.out.println("The user is in insertion page");
	}
	public void deletion_click() {
		driver.findElement(deletion).click();
	}
	public void deletion_page_click() {
		driver.findElement(deletion_page).isDisplayed();
		System.out.println("The user is in deletion page");
	}
	public void erase() {

		driver.findElement(textarea).clear();

	}
	public void tryHere_click() {

        driver.findElement(tryhere).click();

    }
	public void tryherepage_click() {
		driver.findElement(tryhere_page).isDisplayed();
		System.out.println("The user is in TryHere editor page");
	}
	public void Clickwrite() {
        driver.findElement(txt_write).sendKeys("print 'Hello'");
    }
	public void runClick() {
		driver.findElement(run).click();
		
	}

	public void outputText() {

		String display = driver.findElement(output).getText();
		System.out.println("The text editor message is " +display);
	}
	public void practiceQuestionsclick() {
		driver.findElement(practiceQuestions).click();
		
	}

	public void alert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
}
