package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		
		driver= new FirefoxDriver();
		Reporter.log("Initializing Firefox driver");
		
		
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		Reporter.log("open the alerts link");
		
		
		driver.switchTo().defaultContent();
		Reporter.log("switch to default page");
	}
	
	
	
	@Test
	public void simpleAlertTestCase() {
		
		
		WebElement simple =driver.findElement(By.id("simple"));
		Reporter.log("Find the simple alert");
		
		
		System.out.println("Simple alert text is: "+simple.getText());
		Reporter.log("simple alert textr");
		
		
		simple.click();
		Reporter.log("click the simple alert button");
		
		
		Alert simpleAlert = driver.switchTo().alert();
		Reporter.log("Swith to simple alert dialog box");
		
		String simpleAlertText= simpleAlert.getText();
		System.out.println("SimpleAlert Text is: "+simpleAlertText);
		Reporter.log("Simple Alert dialog box text");
		
		Assert.assertEquals(simpleAlertText, "This is a JavaScript Alert!");
		
		
		simpleAlert.accept();
		Reporter.log("Simple Alert Dialog box close");
	
	}
	
	
	@Test
	public void confirmAlertTestCase() {
		
		WebElement conform =driver.findElement(By.id("confirm"));
		Reporter.log("Conform alert button");
		
		
		
		System.out.println("conform alert text is: "+conform.getText());
		Reporter.log("Conform alert button Text");
		
		conform.click();
		Reporter.log("Clicking on conform alert button");
		
		
		Alert conformAlert = driver.switchTo().alert();
		Reporter.log("Swithing to conform alert");
		
		String conformAlertText =conformAlert.getText();
		System.out.println("conformAlert Text is: "+conformAlertText);
		Reporter.log("Conform alert dialog box text");
		
		Assert.assertEquals(conformAlertText, "This is a JavaScript Confirmation!");
		Reporter.log("conform alert dialog box text match");
		
		conformAlert.accept();
		Reporter.log("closing the conform alert dialog box");
	}
	
	
	@Test
	public void promptAlertTestCase() {
		
		WebElement prompt= driver.findElement(By.id("prompt"));
		Reporter.log("Prompt alert button");
		
		System.out.println("prompt alert text is: "+prompt.getText());
		Reporter.log("Prompt alert text");
		
		prompt.click();
		Reporter.log("Clicking on prompt alert button");
		
		Alert promptAlert = driver.switchTo().alert();
		Reporter.log("Swithing to prompt alert");
		
		promptAlert.sendKeys("Pavan");
		Reporter.log("Entered the text into prompt alert input box");
		
		String promptAlertText =promptAlert.getText();
		Reporter.log("Prompt alert dialog box input box text");
		
		System.out.println("conformAlert Text is: "+promptAlertText);
		
		Assert.assertEquals(promptAlertText, "This is a JavaScript Prompt!");
		Reporter.log("Asserting the prompt alert input box text");
		
		promptAlert.accept();
		Reporter.log("Closing the prompt alert");
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
