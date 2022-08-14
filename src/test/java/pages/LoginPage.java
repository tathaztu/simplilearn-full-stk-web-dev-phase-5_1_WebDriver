package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String strUserName, String strPassword) {

		// Click on Login Link
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		// Enter User Name
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys(strUserName);
		
		// Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(strPassword);
		
		// Remember Me
		WebElement rememberMe = driver.findElement(By.className("rememberMe"));
		rememberMe.click();
		
		// Click Login
		WebElement loginButton = driver.findElement(By.name("btn_login"));
		loginButton.click();
	}
	
}
