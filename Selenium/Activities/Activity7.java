package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		System.out.println(driver.getTitle());
		Actions ac = new Actions(driver);
		
		WebElement football = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement zone1 = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		
		
		ac.clickAndHold(football).moveToElement(zone1).pause(2000).release().build().perform();
		
		String zone1verify = zone1.findElement(By.tagName("p")).getText();
		
		if(zone1verify.equals("Dropped!")) {
			System.out.println("Ball is in zone 1");
		}
		
		WebElement zone2 = driver.findElement(By.xpath("//*[@id='dropzone2']"));
		
		ac.dragAndDrop(zone1, zone2).pause(2000).release().build().perform();
		
		String zone2verify = zone2.findElement(By.tagName("p")).getText();
		
		if(zone2verify.equals("Dropped!")) {
			System.out.println("Ball is in zone 2");
		}
		
		driver.quit();

	}

}
