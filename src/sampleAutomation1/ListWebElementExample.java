package sampleAutomation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElementExample {

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
		driver.get("https://demo.automationtesting.in/Register.html");

		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		driver.close();
	}

}
