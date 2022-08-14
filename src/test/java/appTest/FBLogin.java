package appTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// Full Screen
		driver.manage().window().maximize();
		// Timeouts
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		// Thread.sleep(5000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("abc@def.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("iuyabs7q208eb@xyz");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();
		
		WebElement randomLabel1 = driver.findElement(By.xpath("//*[text()='Recent Logins']"));
		WebElement randomLabel2 = driver.findElement(By.xpath("//*[contains(text(),'Recent Logins')]"));
		WebElement randomLabel3 = driver.findElement(By.xpath("//*[contains(@id, 'Footer')]"));
		WebElement randomLabel4 = driver.findElement(By.xpath("//*[starts-with(text(),'Click')]"));
		WebElement randomLabel5 = driver.findElement(By.xpath("//a[@class='logo']/img"));
		WebElement randomLabel6 = driver.findElement(By.xpath("//a[@class='logo']/parent::*"));
		WebElement randomLabel7 = driver.findElement(By.xpath("//a[@class='logo']/following-sibling::nav"));
		WebElement randomLabel8 = driver.findElement(By.xpath("//a[@class='logo']/following-sibling::nav[1]"));
		// //a[@class='logo']/following::div
		// //a[@class='logo']/following::div[1]
		// //a[@class='logo']/preceding::div
		// //a[@class='logo']/ancestor::div
		
		
		
		
		
		
		
		
	}
	
}
