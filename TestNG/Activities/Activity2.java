package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/target-practice");

	}

	@Test
	public void test1() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Target Practice");

	}

	@Test
	public void test2() {
		WebElement black = driver.findElement(By.xpath("//*[text()='Black']"));
		Assert.assertTrue(black.isDisplayed());
		Assert.assertEquals(black.getText(), "black");

	}

	@Test(enabled = false)
	public void test3() {

	}

	@Test
	public void test4() {
		throw new SkipException("Skipping Test");

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
