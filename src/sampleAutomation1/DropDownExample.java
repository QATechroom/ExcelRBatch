package sampleAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

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
				
				// Select value from skills dropdown
				Select skills = new Select(driver.findElement(By.id("Skills")));
				//skills.selectByVisibleText("Tech Support");
				//skills.selectByValue("Word Processing");
				skills.selectByIndex(10);
				Thread.sleep(2000);
				
				driver.close();
				
	}

}
