package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		// System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com");
		
		// Full Screen
		driver.manage().window().maximize();
		// Timeouts
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		Thread.sleep(5000);
		
		// Click on Login Link
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		// Enter User Name
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("abc@xyz.com");
		
		// Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abc@1234");
		
		// Remember Me
		WebElement rememberMe = driver.findElement(By.className("rememberMe"));
		rememberMe.click();
		
		// Click Login
		WebElement loginButton = driver.findElement(By.name("btn_login"));
		loginButton.click();
		
		
		// Error Message
		WebElement errorMsg = driver.findElement(By.id("msg_box"));
		
		String strErrorMsg = errorMsg.getText();
		
		String strExpectedError = "The email or password you have entered is invalid.";

		if(strErrorMsg.equals(strExpectedError)) {
			System.out.println("TC Passed");
		} else {
			System.out.println("TC Failed");
		}
		
		List<WebElement> listHyperLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Count of Hyperlinks - " + listHyperLinks.size());
		
		for(int i = 0; i < listHyperLinks.size(); i++) {
			System.out.println((i+1) + listHyperLinks.get(i).getText() + " | " + listHyperLinks.get(i).getAttribute("href"));
		}
		
		//driver.close();
	}

}
