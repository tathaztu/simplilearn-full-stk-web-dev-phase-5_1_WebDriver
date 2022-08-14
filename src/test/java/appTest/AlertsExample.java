package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		// Full Screen
		driver.manage().window().maximize();
		// Timeouts
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement alertDisplayElement = driver.findElement(By.xpath("//*[@id='alertButton']"));
		alertDisplayElement.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		alert.accept();
		
	}
	
}
