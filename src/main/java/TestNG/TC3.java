package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3 {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups = {"sanity"})
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups = {"regressing"})
	public void test5() {
		System.out.println("Test 5");
	}
	
	@Test(groups = {"regressing", "sanity"})
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test(groups = {"regressing"})
	public void test2() {
		System.out.println("Test 2");
		Assert.fail();
	}

}
