package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver= new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");
	}
	
	
	@DataProvider(name ="Authentication")
	public static Object[][] credentials(){
		Object[][] inputdata= {{"admin","password","Welcome Back, admin"},
				{"user1","password1", "Invalid Credentials"}};
		
		return inputdata;
	}
	
	
	
	@Test(dataProvider="Authentication")
	public void loginTest(String username, String password, String message) {
		WebElement name = driver.findElement(By.id("username"));
		WebElement passwd = driver.findElement(By.id("password"));
		
		name.clear();
		passwd.clear();
		
		name.sendKeys(username);
		passwd.sendKeys(password);
		
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		String mgs =driver.findElement(By.id("action-confirmation")).getText();
		
		Assert.assertEquals(mgs, message);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
