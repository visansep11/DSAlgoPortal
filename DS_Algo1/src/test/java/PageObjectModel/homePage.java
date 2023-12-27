package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;


public class homePage {

	static WebDriver driver;
	By page = By.linkText("NumpyNinja");
	By btn_GetStarted = By.xpath("//a[@href('data-structures-introduction')]");
	static By dropdown_DataStructures =By.xpath("//a[text()='Data Structures']");
	By arrays = By.xpath("//a[text()='Arrays']");
	By linkedlist = By.xpath("//a[text()='Linked List']");
	By stack = By.xpath("//a[text()='Stack']");
	By queue = By.xpath("//a[text()='Queue']");
	By tree = By.xpath("//a[text()='Tree']");
	By graph = By.xpath("//a[text()='Graph']");
	By dataStructure_Intro = By.xpath("//a[@href='data-structures-introduction']");
	By array_Intro = By.xpath("//a[@href='array']");
	By linkedlist_Intro = By.xpath("//a[@href='linked-list']");
	By stack_Intro = By.xpath("//a[@href='stack']");
	By queue_Intro = By.xpath("//a[@href='queue']");
	By tree_Intro = By.xpath("//a[@href='tree']");
	By graph_Intro = By.xpath("//a[@href='graph']");
	By signin = By.linkText("Sign in");
	By register = By.cssSelector("a[href='/register']");
	



	public homePage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void DataStructure_Signin() {
		
		driver.findElement(page).isDisplayed();
		driver.findElement(signin).click();
		
	}
	
public void DataStructure_Register() {
		
		driver.findElement(page).isDisplayed();
		driver.findElement(register).click();
		
	}


	public static void displayelement() {

		driver.findElement(dropdown_DataStructures).isDisplayed();
		//driver.navigate().to("https://dsportalapp.herokuapp.com/home");

	}

	public void DataStructures() {

		driver.findElement(dropdown_DataStructures).click();	

	}

	public String array_click() throws InterruptedException  {
		String array_alert = null;		

		//driver.findElement(dropdown_DataStructures).click();
		//List<WebElement> drop = driver.findElements(dropdown_DataStructures);
		//List<WebElement> drop = driver.findElements(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div"));
		//		for(int i=0;i<drop.size();i++) {
		//			WebElement element = drop.get(i);
		//			String innerhtml=element.getAttribute("innerHTML");
		//			System.out.println("Values from dropdown is ====== " +innerhtml);
		//			Thread.sleep(2000);
		//			System.out.println("uhfdlslk");
		//			Thread.sleep(1000);
		//		int i=0;
		//		
		//		List<WebElement> drop = driver.findElements(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div"));
		//
		//		for (WebElement webElement : drop) {
		//		//	driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div")).click();
		//			WebElement element = drop.get(i);
		//			
		//			boolean array1= element.isDisplayed();
		//			if(array1) {
		//				element.click();
		//				Thread.sleep(1000);
		//			//	System.out.println("uhfdlslk");
		//				alert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();
		//				
		//			}
		//			System.out.println("hsbdfhbskjfnksndfsj"+ alert);
		//		i++;
		//			
		//		}
		boolean array1= driver.findElement(arrays).isDisplayed();
		if(array1) {
			driver.findElement(arrays).click();
			Thread.sleep(1000);
			array_alert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Array Alert Message is "+ array_alert);

		return array_alert;

	}

	public String linked_listclick() throws InterruptedException  {


		String linkedlist_alert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean linkedlist1= driver.findElement(linkedlist).isDisplayed();
		if(linkedlist1) {
			driver.findElement(linkedlist).click();
			Thread.sleep(1000);
			linkedlist_alert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("linkedlist Alert Message is "+ linkedlist_alert);

		return linkedlist_alert;


	}

	public String Stack_click() throws InterruptedException  {


		String Stack_alert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean Stack1= driver.findElement(stack).isDisplayed();
		if(Stack1) {
			driver.findElement(stack).click();
			Thread.sleep(1000);
			Stack_alert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Stack Alert Message is "+ Stack_alert);

		return Stack_alert;


	}

	public String Queue_click() throws InterruptedException  {


		String Queue_alert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean queue1= driver.findElement(queue).isDisplayed();
		if(queue1) {
			driver.findElement(queue).click();
			Thread.sleep(1000);
			Queue_alert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Queue Alert Message is "+ Queue_alert);

		return Queue_alert;


	}

	public String Tree_click() throws InterruptedException  {


		String Tree_alert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean tree1= driver.findElement(tree).isDisplayed();
		if(tree1) {
			driver.findElement(tree).click();
			Thread.sleep(1000);
			Tree_alert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Tree Alert Message is "+ Tree_alert);

		return Tree_alert;


	}

	public String Graph_click() throws InterruptedException  {


		String graph_alert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean graph1= driver.findElement(graph).isDisplayed();
		if(graph1) {
			driver.findElement(graph).click();
			Thread.sleep(1000);
			graph_alert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Graph Alert Message is "+ graph_alert);

		return graph_alert;


	}

	public String  dataStructure_Introclick() throws InterruptedException  {


		String dataStructure_Introalert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean dataStructure1= driver.findElement(dataStructure_Intro).isDisplayed();
		if(dataStructure1) {
			driver.findElement(dataStructure_Intro).click();
			Thread.sleep(1000);
			dataStructure_Introalert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("dataStructure_Introalert Message is "+ dataStructure_Introalert);

		return dataStructure_Introalert;


	}

	public String array_Introclick() throws InterruptedException  {


		String array_Introalert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean array_Intro1= driver.findElement(array_Intro).isDisplayed();
		if(array_Intro1) {
			driver.findElement(array_Intro).click();
			Thread.sleep(1000);
			array_Introalert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Array Alert Message is "+ array_Introalert);

		return array_Introalert;


	}

	public String linkedlist_Introclick() throws InterruptedException  {


		String linkedlist_Introalert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean linkedlist_Intro1= driver.findElement(linkedlist_Intro).isDisplayed();
		if(linkedlist_Intro1) {
			driver.findElement(linkedlist_Intro).click();
			Thread.sleep(1000);
			linkedlist_Introalert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Linkedlist Alert Message is "+ linkedlist_Introalert);

		return linkedlist_Introalert;


	}

	public String stack_Introclick() throws InterruptedException  {


		String stack_Introalert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean stack_Intro1= driver.findElement(stack_Intro).isDisplayed();
		if(stack_Intro1) {
			driver.findElement(stack_Intro).click();
			Thread.sleep(1000);
			stack_Introalert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Stack Alert Message is "+ stack_Introalert);

		return stack_Introalert;


	}

	public String queue_Introclick() throws InterruptedException  {


		String queue_Introalert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean queue_Intro1= driver.findElement(queue_Intro).isDisplayed();
		if(queue_Intro1) {
			driver.findElement(queue_Intro).click();
			Thread.sleep(1000);
			queue_Introalert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Queue Alert Message is "+ queue_Introalert);

		return queue_Introalert;


	}

	public String tree_Introclick() throws InterruptedException  {


		String tree_Introalert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean tree_Intro1= driver.findElement(tree_Intro).isDisplayed();
		if(tree_Intro1) {
			driver.findElement(tree_Intro).click();
			Thread.sleep(1000);
			tree_Introalert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Tree Alert Message is "+ tree_Introalert);

		return tree_Introalert;


	}

	public String graph_Introclick() throws InterruptedException  {


		String graph_Introalert = null;	
		driver.findElement(dropdown_DataStructures).click();
		boolean graph_Intro1= driver.findElement(graph_Intro).isDisplayed();
		if(graph_Intro1) {
			driver.findElement(graph_Intro).click();
			Thread.sleep(1000);
			graph_Introalert = (driver.findElement(By.cssSelector("div[role='alert']")).getText()).toString();

		}
		System.out.println("Graph Alert Message is "+ graph_Introalert);

		return graph_Introalert;


	}


}




















