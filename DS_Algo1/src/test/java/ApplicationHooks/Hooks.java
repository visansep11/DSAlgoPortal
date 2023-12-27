package ApplicationHooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.Scenario;


public class Hooks {

	ChromeOptions co;
	private static WebDriver driver;
	
	
	public static WebDriver browserSetup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		
	return driver;
	}
	
		@After
		public void tearDown_close(Scenario sc) {
			try {
			String screenshotname = sc.getName().replaceAll(" ", "-");
			if (sc.isFailed()) {
				sc.log("This is my failure message");
			    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			    sc.attach(screenshot, "image/png", screenshotname);
			}
			}catch (Exception e) {
				e.printStackTrace();
			}driver.close();
			driver.quit();
			
//			System.out.println("close the browser");
//			System.out.println(sc.getName());
//			driver.close();
//			driver.quit();
			
		}
}

