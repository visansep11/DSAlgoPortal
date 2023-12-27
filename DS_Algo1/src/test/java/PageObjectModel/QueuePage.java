package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueuePage {
	
	static WebDriver driver;
	By Queue_Started = By.cssSelector("a[href='queue']");
	By Queue_StartedPage = By.cssSelector("body");
	By Implementation_Queue = By.linkText("Implementation of Queue in Python");
	By Implementation_QueuePage = By.cssSelector("body");
	By Implementation_Collections = By.linkText("Implementation using collections.deque");
	By Implementation_CollectionsPage = By.cssSelector("body");
	By Implementation_Array = By.linkText("Implementation using array");
	By Implementation_ArrayPage = By.cssSelector("body");
	By Queue_Operations = By.linkText("Queue Operations");
	By Queue_OperationsPage = By.cssSelector("body");
	By Practice_Questions = By.linkText("Practice Questions");
	
	public QueuePage(WebDriver driver) {
		this.driver = driver;
	}
	public void Queue_StartedClick() {

		driver.findElement(Queue_Started).click();

	}
	public void Queue_StartedPage_click() {
		driver.findElement(Queue_StartedPage).isDisplayed();
		System.out.println("The user is in Queue page");
	}
	
	public void Implementation_QueueClick() {

		driver.findElement(Implementation_Queue).click();

	}
	public void Implementation_QueuePage_click() {
		driver.findElement(Implementation_QueuePage).isDisplayed();
		System.out.println("The user is in Implementation of Queue in python page");
	}
	public void Implementation_CollectionsClick() {

		driver.findElement(Implementation_Collections).click();

	}
	public void Implementation_CollectionsPage_click() {
		driver.findElement(Implementation_CollectionsPage).isDisplayed();
		System.out.println("The user is in Implementation using Collections page");
	}
	public void Implementation_ArrayClick() {

		driver.findElement(Implementation_Array).click();

	}
	public void Implementation_ArrayPage_click() {
		driver.findElement(Implementation_ArrayPage).isDisplayed();
		System.out.println("The user is in Implementation Array page");
	}
	public void Queue_Operations_Click() {

		driver.findElement(Queue_Operations).click();

	}
	public void Queue_OperationsPage_click() {
		driver.findElement(Queue_OperationsPage).isDisplayed();
		System.out.println("The user is in Queue Operations page");
	}
	
	public void practiceQuestionsclick() {
		driver.findElement(Practice_Questions).click();

	}

}
