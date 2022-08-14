package webTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {

	@Test
	public void PositiveTest () {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("abc@xyz.com", "Abc@1234");

	}

	@Test
	public void negativeTest() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("abc@xyz.com", "Abc@1234");

		// Error Message
		WebElement errorMsg = driver.findElement(By.id("msg_box"));

		String strErrorMsg = errorMsg.getText();

		String strExpectedError = "The email or password you have entered is invalid.";

		Assert.assertEquals(strErrorMsg, strExpectedError);
	}

}
