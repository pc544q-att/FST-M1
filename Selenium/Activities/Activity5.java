package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/input-events");
		driver.getTitle();
		Actions ac = new Actions(driver);
		
		ac.click().build().perform();
		
		System.out.println("After Left Click front text: "+ driver.findElement(By.xpath("//div[@class='active']")).getText());
		
		Thread.sleep(200);
		
        ac.doubleClick().build().perform();
		
		System.out.println("After double Click front text: "+ driver.findElement(By.xpath("//div[@class='active']")).getText());
		
		Thread.sleep(200);
		
		ac.contextClick().build().perform();
		
		System.out.println("After Right Click front text: "+ driver.findElement(By.xpath("//div[@class='active']")).getText());
		
		Thread.sleep(200);
		
		driver.quit();
		

	}

}
