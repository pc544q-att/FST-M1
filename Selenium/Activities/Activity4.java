package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/target-practice");
		
		System.out.println("Third Header "+driver.findElement(By.xpath("//h3[text()='Third header']")).getText());
		
		System.out.println("5th Header color "+driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color"));
		
		System.out.println("Violet color all classes( ui violet button)  "+driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class"));
		
		System.out.println("Gray button text(Grey) "+driver.findElement(By.xpath("//button[text()='Grey']")).getText());
		
		driver.quit();
		
		

	}

}
