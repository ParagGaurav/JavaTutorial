package javapackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogging {

	public static void main(String[] args) {
		// Create Logger Instance 
		Logger logger = Logger.getLogger("Log4jLogging");
		
		// configure log4j properties file 
		
		PropertyConfigurator.configure("/Users/paraggaurav/eclipse-workspace/JavaTutorial/Repository/log4j.properties");
		
		// Open Browser instance
		System.setProperty("webdriver.chrome.driver", "/Users/paraggaurav/Downloads/Software/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Broowser Instance Opened");
		
		//Maximize the window
		driver.manage().window().maximize();
		logger.info("Window maximized");
		
		// Implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait given");
		
		//Open Url
		
		driver.get("https://www.facebook.com/");
		logger.info("Application Opened");
		
		// check if the element displayed or not 
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("web element displayed");
		} catch (Exception e) {
			
			logger.info("Failure- 'emails' web element is not displayed"); 
		}
		
		

	}

}