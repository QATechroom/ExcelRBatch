package sampleAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Open the Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\SeleniumLibraries\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Pass the URL
		driver.get("https://demo.automationtesting.in/Frames.html");

		Thread.sleep(2000);

		driver.switchTo().frame("singleframe");

		Thread.sleep(2000);

		WebElement textField = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		textField.sendKeys("Selenium Test Automation platform");

		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		// Click on WebTable menu
		driver.findElement(By.linkText("WebTable")).click();

		Thread.sleep(3000);

		driver.close();

	}

}
