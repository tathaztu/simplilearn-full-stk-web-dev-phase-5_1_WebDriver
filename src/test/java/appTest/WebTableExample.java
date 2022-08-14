package appTest;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// Full Screen
		driver.manage().window().maximize();
		// Timeouts
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		List<WebElement> listWebElementsRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total number of rows - " + listWebElementsRows.size());
		
		List<WebElement> listWebElementsCols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total number of cols - " + listWebElementsCols.size());
		
		// Data
		for(int i = 0; i < listWebElementsRows.size(); i++) {
			if (i == 0) {
				for (WebElement webElement : listWebElementsCols) {
					System.out.print(webElement.getText() + "\t\t");
				}
			} else  {
				List<WebElement> listWebElementsColsForRow = 
					driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + (i+1) + " ]/td"));
				for (WebElement webElement : listWebElementsColsForRow) {
					System.out.print(webElement.getText() + "\t\t");
				}
			}
			System.out.println();
		}
		
	}
	
}
