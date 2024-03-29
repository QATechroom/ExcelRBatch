package sampleAutomation1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class CaptureScreenshotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Open the Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\SeleniumLibraries\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Pass the URL
		driver.get("https://demo.automationtesting.in/WebTable.html");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Capture screenshot and save it to a file
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			// Define the location to save the screenshot
			FileUtils.copyFile(screenshotFile, new File("screenshot.png"));
			System.out.println("Screenshot saved successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
