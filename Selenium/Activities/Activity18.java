package activities;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity18 {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://v1.training-support.net/selenium/selects");

		System.out.println("Home page title: " + driver.getTitle());

		WebElement selectElement = driver.findElement(By.id("multi-select"));

		Select multiSelect = new Select(selectElement);

		// Select "Javascript" using visible text
		multiSelect.selectByVisibleText("Javascript");

		// Select 4th, 5th, and 6th index options
		for (int i = 4; i <= 6; i++) {
			multiSelect.selectByIndex(i);
		}

		// Select "NodeJS" using value attribute
		multiSelect.selectByValue("node");

		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("Selected options are: ");
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}

		// Deselect the 5th index option
		multiSelect.deselectByIndex(5);
		// Print the selected options
		selectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("Selected options are: ");
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}

		driver.quit();
	}

}
