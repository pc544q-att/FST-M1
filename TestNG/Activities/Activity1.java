package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Activity1 {
	
	WebDriver driver;
	
	// Setup function
	@BeforeClass
	public void setup() {		
		
		//Initialize the firefox driver
		driver = new FirefoxDriver();
		
		//Open the page		
		driver.get("https://v1.training-support.net/");
		
	}
	
	//Test Function
	@Test(priority=1)
	public void homepageTest() {
		//Assert page title
		Assert.assertEquals(driver.getTitle(),"Training Support");
		
		//Find the element
		driver.findElement(By.id("about-link")).click();
	}
	
	@Test(priority=2)
	public void aboutpageTest() {
		//Assert page Title
		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	
	//Teardown Function
	@AfterClass
	public void tearDown() {
		//Close the browser
		driver.quit();
	}
	
	
	

}
