package sampleAutomation1;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementExample {

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
		
		// Capture the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);

		// Capture the page source
		String PageSource = driver.getPageSource();
		System.out.println("The source code of the page is " +PageSource);
		
		Thread.sleep(2000);
		
		// Click on WebTable menu
		WebElement menu = driver.findElement(By.linkText("WebTable"));
		menu.click();
		
		Thread.sleep(3000);
		
		// Capture the current URL of the application
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("The current URL is "+CurrentURL);
		
		// Navigate back to Register menu
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		// Enter FirstName & LastName
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		FirstName.isDisplayed();
		System.out.println("First name field is displayed");
		FirstName.sendKeys("Smith");
		
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("James");
		
		// Select Gender
		WebElement Gender = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		Gender.isEnabled();
		Gender.click();
		
		Thread.sleep(2000);
		
		// Select Hobbies
		driver.findElement(By.id("checkbox1")).click();
		
		driver.findElement(By.id("checkbox1")).isSelected();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox2")).isSelected();
		driver.findElement(By.id("checkbox3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).clear();
		
		
		
		Thread.sleep(5000);				

		// Close the browser
		driver.close();

	}

}