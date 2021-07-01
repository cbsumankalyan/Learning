package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	
	@BeforeSuite
	public void opening_browser() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void add_customer() {
		System.out.println("Before Test in suite level");
	}
	
	@BeforeClass
	public void search_customer() {
		System.out.println("Before Class in test level");
	}
	
	@BeforeMethod
	public void close_browser1() {
		System.out.println("Before Method in Class level");
	}
	
	@Test
	public void test() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 2");
	}
	
	@AfterSuite
	public void opening_browser2() {
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void signup_customer() {
		System.out.println("After Test in suite level");
	}
	
	@AfterClass
	public void login_customer() {
		System.out.println("After class in Test level");
	}
	
	@AfterMethod
	public void close_browser() {
		System.out.println("After Method in Class level");
	}

}
