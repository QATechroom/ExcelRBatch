package sampleAutomation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Open the Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\SeleniumLibraries\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Pass the URL
		driver.get("https://demo.automationtesting.in/Frames.html");
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.switchTo().frame("singlefra");
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement textField = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		textField.sendKeys("Selenium Test Automation platform");
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Click on WebTable menu
		driver.findElement(By.linkText("WebTable")).click();
		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.close();
	}

}
