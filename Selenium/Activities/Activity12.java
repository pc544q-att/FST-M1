package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement text = driver.findElement(By.id("dynamicText"));
		
		WebElement textbox = driver.findElement(By.id("toggleInput"));
		
		System.out.println("Text field is enabled: "+ text.isEnabled());
		
		textbox.click();
		
		System.out.println("Text field is enabled: "+ text.isEnabled());
		
		driver.quit();
		
		
		
		

	}

}
