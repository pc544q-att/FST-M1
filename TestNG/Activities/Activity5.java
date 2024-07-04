package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {

	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/target-practice");

	}

	@Test(groups = {"Headers", "Button"})
	public void pagetitle() {

		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}

	@Test(dependsOnMethods = {"pagetitle"}, groups = {"Headers"})
	public void thirdHeader() {

		String header = driver.findElement(By.id("third-header")).getText();
		Assert.assertEquals(header, "Third header");

	}

	@Test(dependsOnMethods = {"pagetitle"}, groups = {"Headers"})
	public void fifthHeader() {
		WebElement header = driver.findElement(By.xpath("//h5[text()='Fifth header']"));
		Assert.assertEquals(header.getCssValue("color"), "rgb(33, 186, 69)");
	}

	@Test(dependsOnMethods = { "pagetitle" }, groups = { "Button" })
	public void ButtonTest1() {

		WebElement button1 = driver.findElement(By.cssSelector("button.olive"));

		Assert.assertEquals(button1.getText(), "Olive");

	}

	@Test(dependsOnMethods = { "pagetitle" }, groups = { "Button" })
	public void ButtonTest2() {

		WebElement button2 = driver.findElement(By.cssSelector("button.brown"));

		Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");

	}

	@AfterClass(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}

}
