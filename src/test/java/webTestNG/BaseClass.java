package webTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		// System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com");
		
		// Full Screen
		driver.manage().window().maximize();
		// Timeouts
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
