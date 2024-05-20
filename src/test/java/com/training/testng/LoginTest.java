package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "url" })
	public void beforemethod(String url) {
		if(driver==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		}
	}

	@Test(priority=2)
	@Parameters({ "username", "password" })
	public void logIntoApplication(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	@AfterMethod
	public void aftermethod() {
		driver.close();
		driver=null;
	}
	@Test(priority=1)
	@Parameters({ "invalidusername", "password" })
	public void logIntoApplicationWithInvalidUsername(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.id("Login")).click();
	}
	
	
}
