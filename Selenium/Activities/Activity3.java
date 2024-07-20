package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Activity1();
		Activity2();
		
		

	}
	
	public static void Activity1() {
		
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text() = 'About Us']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	
public static void Activity2() {
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		
		System.out.println(driver.getTitle());
		
		//WebElement username = driver.findElement(By.id("username"));
		WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
		
		username.sendKeys("admin");
		
		//WebElement password = driver.findElement(By.id("password"));
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		
		password.sendKeys("password");
		
		//driver.findElement(By.className("ui")).click();
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
}

}
