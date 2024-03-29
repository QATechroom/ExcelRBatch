package sampleAutomation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Open the Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\SeleniumLibraries\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Pass the URL
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement submit = driver.findElement(By.id("submitbtn"));
		
		js.executeScript("window.scrollBy(0,500)","");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-500)","");
		
		Thread.sleep(3000);
		
		submit.click();

		Thread.sleep(3000);

		driver.close();

	}

}
