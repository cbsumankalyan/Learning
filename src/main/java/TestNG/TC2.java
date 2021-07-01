package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 {
	
	@Test(priority = 1)
	public void opening_browser() {
		System.out.println("Test 1");
	}
	
	@Test(dependsOnMethods = {"test", "opening_browser"}, alwaysRun = true)
	public void signup_customer() {
		System.out.println("Test 3");
	}
	
	@Test(priority = 5)
	public void login_customer() {
		System.out.println("Test 5");
	}
	
	@Test(priority = 4)
	public void close_browser() {
		System.out.println("Test 4");
	}
	
	@Test(priority = 2, dependsOnMethods = {"opening_browser"})
	public void test() {
		System.out.println("Test 2");
		Assert.fail();
	}

}
