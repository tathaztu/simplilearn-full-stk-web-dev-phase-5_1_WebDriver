package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// Full Screen
		driver.manage().window().maximize();
		// Timeouts
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		
		// Click on Signup Link
		WebElement signupLink = driver.findElement(By.xpath("//a[text()='Create new account' ]"));
		signupLink.click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("15");
		

		WebElement monthDD = driver.findElement(By.id("month"));
		Select ddMonth = new Select(monthDD);
		ddMonth.selectByVisibleText("Jun");
		
		// Selecting Month
		List<WebElement> listMonths = driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement month: listMonths) {
			System.out.println(month.getText());
		}

		WebElement selectedYear = driver.findElement(By.xpath("//select[@id='year']/option[@selected='1']"));
		System.out.println("Selected Year: " + selectedYear.getText());
		
//		WebElement genderRadio = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//		genderRadio.click();
		
		String genderValue = "Male";
		WebElement dynamicGen = driver.findElement(By.xpath("//label[text()='" + genderValue + "']/following-sibling::input"));
		dynamicGen.click();
	
	}
	
}
