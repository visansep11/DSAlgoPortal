package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphpage {
	static WebDriver driver;
	By Graph_Started = By.cssSelector("a[href='graph']");
	By Graph_StartedPage = By.cssSelector("body");
	By Graph_LinkPage = By.cssSelector("body");
	By Graph_RepPage = By.cssSelector("body");
	By Graph_Link = By.linkText("Graph");
	By Graph_Rep = By.linkText("Graph Representations");
//	By Practice_Questions = By.linkText("Practice Questions");
	
	public Graphpage(WebDriver driver) {
		this.driver = driver;
	}

	public void Graph_StartedClick() {

		driver.findElement(Graph_Started).click();

	}
	public void Graph_StartedPage_click() {
		driver.findElement(Graph_StartedPage).isDisplayed();
		System.out.println("The user is in Graph page");
	}
	
	public void Graph_LinkClick() {

		driver.findElement(Graph_Link).click();

	}
	public void Graph_LinkPage_click() {
		driver.findElement(Graph_LinkPage).isDisplayed();
		System.out.println("The user is in inner link of graph page");
	}
	
	public void Graph_RepClick() {

		driver.findElement(Graph_Rep).click();

	}
	public void Graph_RepPage_click() {
		driver.findElement(Graph_RepPage).isDisplayed();
		System.out.println("The user is in Graph representation page");
	}
	
//	public void practiceQuestionsclick() {
//		driver.findElement(Practice_Questions).click();
//
//	}

}
