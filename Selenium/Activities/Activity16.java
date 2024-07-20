package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		
		System.out.println("Title of the page is: "+ driver.getTitle());
		
		WebElement username = driver.findElement(By.cssSelector("input[class$='-username']"));
		username.sendKeys("pavan");
		
		WebElement password = driver.findElement(By.cssSelector("input[class$='-password']"));
		password.sendKeys("pavan");
		
		
		WebElement cpassword = driver.findElement(By.xpath("//input[@type='password']"));
		cpassword.sendKeys("pavan");
		
		
		WebElement email = driver.findElement(By.xpath("//input[starts-with(@class,'email-')]"));
		email.sendKeys("pavan@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		String conformation = driver.findElement(By.id("action-confirmation")).getText();
		
		System.out.println("Final Conformation mgs is: "+ conformation);
		
		driver.quit();
		
		
		
		

	}

}
