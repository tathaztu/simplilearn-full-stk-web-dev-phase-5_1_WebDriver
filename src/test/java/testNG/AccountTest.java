package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AccountTest {

	@BeforeTest
	public void Method1() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeMethod
	public void BeforeMethod1() {
		System.out.println("Before Method M1");
	}
	
	@Test(enabled = true, priority = 1, description = "Test test will be validating something")
	public void SavingsAccountTest1() {
		System.out.println("Inside Savings Account Test 1");
	}

	@Test(priority = 0)
	public void SavingsAccountTest2() {
		System.out.println("Inside Savings Account Test 2");
	}
	
	@Test(groups = {"sanity"}, priority = 2)
	public void CheckingAccountTest1() {
		System.out.println("Inside Checking Account Test 1");
	}
	
	@AfterMethod
	public void AfterMethod1() {
		System.out.println("After Method M1");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Inside After Test");
	}
}
