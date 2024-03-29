package sampleAutomation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

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
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().dismiss();

		Thread.sleep(3000);

		// Close the browser
		driver.close();

		/*
		 * // Click on 'Click the button to display an alert box' button WebElement
		 * element = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		 * element.isEnabled(); element.click();
		 * 
		 * //driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 * Thread.sleep(3000); // Once alert message is displayed, switch to alert box
		 * driver.switchTo().alert().accept();
		 * 
		 * Thread.sleep(3000);
		 */

	}

}
