package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		
		System.out.println(driver.getTitle());
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("password");
		
		driver.findElement(By.className("ui")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	}

}
