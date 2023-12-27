package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {
	static WebDriver driver;
	By Stack_Started = By.cssSelector("a[href='stack']");
	By Stack_StartedPage = By.cssSelector("body");
	By Operations_Stack = By.linkText("Operations in Stack");
	By Operations_StackPage = By.cssSelector("body");
	By Implementation = By.linkText("Implementation");
	By Implementation_Page = By.cssSelector("body");
	By Applications = By.linkText("Applications");
	By Applications_Page = By.cssSelector("body");
	//By Practice_Questions = By.linkText("Practice Questions");

	public StackPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Stack_StartedClick() {

		driver.findElement(Stack_Started).click();

	}
	public void Stack_StartedPage_click() {
		driver.findElement(Stack_StartedPage).isDisplayed();
		System.out.println("The user is in Stack page");
	}
	public void Operations_StackClick() {

		driver.findElement(Operations_Stack).click();

	}
	public void Operations_StackPage_click() {
		driver.findElement(Operations_StackPage).isDisplayed();
		System.out.println("The user is in Operations of Stackpage");
	}
	public void ImplementationClick() {

		driver.findElement(Implementation).click();

	}
	public void Implementation_Page_click() {
		driver.findElement(Implementation_Page).isDisplayed();
		System.out.println("The user is in Implementation page");
	}
	public void ApplicationsClick() {

		driver.findElement(Applications).click();

	}
	public void Applications_Page_click() {
		driver.findElement(Applications_Page).isDisplayed();
		System.out.println("The user is in Applications page");
	}
}
