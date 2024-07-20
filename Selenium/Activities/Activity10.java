package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println("Title of the page is: "+ driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.id("dynamicCheckbox"));
		
		WebElement Togglecheckbox = driver.findElement(By.id("toggleCheckbox"));
		
		System.out.println("Check box is displayed: "+ checkbox.isDisplayed());
		
		Togglecheckbox.click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("check box is displayed: "+ checkbox.isDisplayed());
		
		driver.quit();
		
		
		
		

	}

}
