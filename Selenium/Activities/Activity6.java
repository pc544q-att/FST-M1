package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/input-events");
		System.out.println(driver.getTitle());
		Actions ac = new Actions(driver);
		
		ac.sendKeys("P").build().perform();
		
		ac.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		driver.quit();
		
		

	}

}
