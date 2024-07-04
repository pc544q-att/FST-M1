package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

	
	WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");

	}
	
	@Test
	public void test5() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		String conformation =driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals(conformation, "Welcome Back, admin");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
