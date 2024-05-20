package com.training.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TekarchTest {
	@Test(priority=2)
	@Parameters({"username"})
 public void test(String username) {
 System.out.println("I am in the test"+ username);
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("I am in the test2.");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("i am in before method.");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("i am in after method.");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("i am in before test.");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("i am in after test.");
	}
	@BeforeSuite
	public void beforesuit() {
		System.out.println("i am in before suite.");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("i am in after suite.");
	}
	
}
