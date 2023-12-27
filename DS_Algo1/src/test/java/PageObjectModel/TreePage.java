package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreePage {
	static WebDriver driver;
	By Tree_GetStarted = By.cssSelector("a[href='tree']");
	By Tree_Page = By.cssSelector("body");
	By Overview_of_Trees = By.linkText("Overview of Trees");
	By Terminologies = By.linkText("Terminologies");
	By Types_of_Trees = By.linkText("Types of Trees");
	By Tree_Traversals = By.linkText("Tree Traversals");
	By Traversals_Illustration = By.linkText("Traversals-Illustration");
	By Binary_Trees = By.linkText("Binary Trees");
	By Types_of_Binary_Trees = By.linkText("Types of Binary Trees");
	By Implementation_in_Python = By.linkText("Implementation in Python");
	By Binary_Tree_Traversals = By.linkText("Binary Tree Traversals");
	By Implementation_of_Binary_Trees = By.linkText("Implementation of Binary Trees");
	By Applications_of_Binary_trees = By.linkText("Applications of Binary trees");
	By Binary_Search_Trees = By.linkText("Binary Search Trees");
	By Implementation_Of_BST = By.linkText("Implementation Of BST");
//	By tryhere = By.xpath("//a[text()='Try here>>>']");
//	By textarea =By.xpath("//textarea[@id='editor']");
//	By run = By.xpath("//button[text()='Run']");
//	By output = By.xpath("//pre[@id='output']");
//	By txt_write = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
//	By practiceQuestions = By.linkText("Practice Questions");
	By Overview_of_TreesPage = By.cssSelector("body");
	By Terminologies_page = By.cssSelector("body");
	By Types_of_TreesPage = By.cssSelector("body");
	By Tree_TraversalsPage = By.cssSelector("body");
	By Traversals_IllustrationPage = By.cssSelector("body");
	By Binary_TreesPage = By.cssSelector("body");
	By Types_of_Binary_TreesPage = By.cssSelector("body");
	By Implementation_in_PythonPage = By.cssSelector("body");
	By Binary_Tree_TraversalsPage = By.cssSelector("body");
	By Implementation_of_Binary_TreesPage = By.cssSelector("body");
	By Applications_of_Binary_treesPage = By.cssSelector("body");
	By Binary_Search_TreesPage = By.cssSelector("body");
	By Implementation_Of_BSTPage = By.cssSelector("body");
//	By tryhere_page = By.cssSelector("#answer_form");

	public TreePage(WebDriver driver) {
		this.driver = driver;
	}

	public void Tree_GetStartedClick() {

		driver.findElement(Tree_GetStarted).click();

	}
	public void Tree_Page_click() {
		driver.findElement(Tree_Page).isDisplayed();
		System.out.println("The user is in Tree page");
	}
	public void Overview_of_Trees_click() {

		driver.findElement(Overview_of_Trees).click();;
	}

	public void Overview_of_TreesPage_click() {
		driver.findElement(Overview_of_TreesPage).isDisplayed();
		System.out.println("The user is in Overview of Trees page");
	}
	public void Terminologies_click() {

		driver.findElement(Terminologies).click();;
	}

	public void Terminologies_page_click() {
		driver.findElement(Terminologies_page).isDisplayed();
		System.out.println("The user is in Terminologies page");
	}

	public void Types_of_Trees_click() {

		driver.findElement(Types_of_Trees).click();;
	}

	public void Types_of_TreesPage_click() {
		driver.findElement(Types_of_TreesPage).isDisplayed();
		System.out.println("The user is in Types of TreesPage");
	}

	public void Tree_Traversals_click() {

		driver.findElement(Tree_Traversals).click();;
	}

	public void Tree_TraversalsPage_click() {
		driver.findElement(Tree_TraversalsPage).isDisplayed();
		System.out.println("The user is in Tree Traversals Page");
	}

	public void Traversals_Illustration_click() {

		driver.findElement(Traversals_Illustration).click();;
	}

	public void Traversals_IllustrationPage_click() {
		driver.findElement(Traversals_IllustrationPage).isDisplayed();
		System.out.println("The user is in Traversals Illustration Pagee");
	}

	public void Binary_Trees_click() {

		driver.findElement(Binary_Trees).click();;
	}

	public void Binary_TreesPage_click() {
		driver.findElement(Binary_TreesPage).isDisplayed();
		System.out.println("The user is in Binary Trees Page");
	}

	public void Types_of_Binary_Trees_click() {

		driver.findElement(Types_of_Binary_Trees).click();;
	}

	public void Types_of_Binary_TreesPage_click() {
		driver.findElement(Types_of_Binary_TreesPage).isDisplayed();
		System.out.println("The user is in Types of Binary Trees Page");
	}
	public void Implementation_in_Python_click() {

		driver.findElement(Implementation_in_Python).click();;
	}

	public void Implementation_in_PythonPage_click() {
		driver.findElement(Implementation_in_PythonPage).isDisplayed();
		System.out.println("The user is in Implementation in Python Page");
	}
	public void Binary_Tree_Traversals_click() {

		driver.findElement(Binary_Tree_Traversals).click();;
	}

	public void Binary_Tree_TraversalsPage_click() {
		driver.findElement(Binary_Tree_TraversalsPage).isDisplayed();
		System.out.println("The user is in Binary Tree Traversals Page ");
	}

	public void Implementation_of_Binary_Trees_click() {

		driver.findElement(Implementation_of_Binary_Trees).click();;
	}

	public void Implementation_of_Binary_TreesPage_click() {
		driver.findElement(Implementation_of_Binary_TreesPage).isDisplayed();
		System.out.println("The user is in Implementation of Binary Trees Page ");
	}
	public void Applications_of_Binary_trees_click() {

		driver.findElement(Applications_of_Binary_trees).click();;
	}

	public void Applications_of_Binary_treesPage_click() {
		driver.findElement(Applications_of_Binary_treesPage).isDisplayed();
		System.out.println("The user is in Applications of Binary trees Page");
	}

	public void Binary_Search_Trees_click() {

		driver.findElement(Binary_Search_Trees).click();;
	}

	public void Binary_Search_TreesPage_click() {
		driver.findElement(Binary_Search_TreesPage).isDisplayed();
		System.out.println("The user is in Binary Search TreesPage");
	}
	public void Implementation_Of_BST_click() {

		driver.findElement(Implementation_Of_BST).click();;
	}

	public void Implementation_Of_BSTPage_click() {
		driver.findElement(Implementation_Of_BSTPage).isDisplayed();
		System.out.println("The user is in Implementation Of BSTPage");
	}
//
//	public void erase() {
//
//		driver.findElement(textarea).clear();
//
//	}
//	public void tryHere_click() {
//
//		driver.findElement(tryhere).click();
//
//	}
//	public void tryherepage_click() {
//		driver.findElement(tryhere_page).isDisplayed();
//		System.out.println("The user is in TryHere editor page");
//	}
//	public void Clickwrite() {
//		driver.findElement(txt_write).sendKeys("print 'Hello'");
//	}
//	public void runClick() {
//		driver.findElement(run).click();
//
//	}
//
//	public void outputText() {
//
//		String display = driver.findElement(output).getText();
//		System.out.println("The text editor message is " +display);
//	}
//	public void practiceQuestionsclick() {
//		driver.findElement(practiceQuestions).click();
//
//	}
}
