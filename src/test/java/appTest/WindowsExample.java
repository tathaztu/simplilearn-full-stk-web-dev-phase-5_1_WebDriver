package appTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		// Full Screen
		// driver.manage().window().maximize();
		// Timeouts
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String parentWinHandler = driver.getWindowHandle();
		System.out.println("Before clicking tab button: " + parentWinHandler);
		
		WebElement tab = driver.findElement(By.id("tabButton"));
		tab.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String strHandle: handles) {
			System.out.println(strHandle);
			
			if(!strHandle.equals(parentWinHandler)) {
				driver.switchTo().window(strHandle);
				break;
			}
		}
		
		WebElement childWindowElement = driver.findElement(By.tagName("h1"));
		System.out.println("Text on new window is: " + childWindowElement.getText());
		driver.close();
		
		driver.switchTo().window(parentWinHandler);
		System.out.println("Back to parent window");
		driver.close();
	}
}
