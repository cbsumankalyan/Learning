package Annotations;

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
	public void test5() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void test6() {
		System.out.println("Before Test ");
	}
	
	@BeforeClass
	public void test1() {
		System.out.println("Before Class ");
	}
	
	@BeforeMethod
	public void test3() {
		System.out.println("Before Method");
	}
	
	@AfterSuite
	public void test4() {
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void test7() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void test2() {
		System.out.println("After class");
	}
	
	@AfterMethod
	public void test9() {
		System.out.println("After Method");
	}
	
	@Test
	public void test90() {
		System.out.println("Test 1 2");
	}
}
