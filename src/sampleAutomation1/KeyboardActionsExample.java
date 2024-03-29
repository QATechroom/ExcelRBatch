package sampleAutomation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsExample {

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
		
		Actions actions = new Actions(driver);
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		
		actions.contextClick(FirstName)
				.sendKeys(Keys.ESCAPE)
				.contextClick(LastName)
				.sendKeys(Keys.TAB)
				.build()
				.perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
