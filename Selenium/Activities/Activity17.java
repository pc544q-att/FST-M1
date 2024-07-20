package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/selects");
		
		System.out.println("Page Title is: "+driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.id("single-select"));
		
		dropdown.click();
		
		Select singleselect = new Select(dropdown);
		
		singleselect.selectByVisibleText("Option 2");
		singleselect.selectByIndex(3);
		
		singleselect.selectByValue("4");
		
		List<WebElement> options = singleselect.getOptions();
		
		for (WebElement option : options) {
			System.out.println(option.getText());
			
		}
		
		
		driver.quit();
		
		
		
		
		

	}

}
