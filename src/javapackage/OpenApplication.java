package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class OpenApplication {
	public static void main(String[] args) throws Exception {

		// Setting the Property of chrome browser and passingchrome driver path

		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64//chromedriver");

		// Launching chrome Browser Instance

		WebDriver driver = new ChromeDriver();

		// Open URL using get() method

		driver.get("https://web.whatsapp.com/");
		
		
		
		
		// Create the  JavascriptExecutor object
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 // find element using id attribute
		WebElement username= driver.findElement(By.id("passContainer"));
		Thread.sleep(2000);
		
		// call the executeScript method
		js.executeScript("arguments[0].style.border= 'solid 2px red'",username);
		// Maximize the Window

		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		// delete all cookies
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		
		//Open Url Using navigate() method
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		
		// Refresh the page 
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		// Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();
		
		// Navigate to forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		// fetch current url
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		// Get title of the web page 
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		// close the browser
		driver.close();
		
		

	}

}
