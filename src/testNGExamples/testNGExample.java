package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testNGExample {

	public WebDriver driver = null;

	@Test
	public void openBrowser() throws InterruptedException {
		// Open the Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\SeleniumLibraries\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();

		Thread.sleep(2000);
	}

	@Test
	public void URL() throws InterruptedException {

		// Pass the URL
		driver.get("https://demo.automationtesting.in/Register.html");

		// Capture the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);

	}

	@Test
	public void closeBrowser() {
		// Close the browser
		driver.close();
	}

}
