package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		// Alert Handling
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click(); 
		
		// Verify Alert Text 
		
		String alertText = driver.switchTo().alert().getText();
		String expAlertText = "Do you confirm action?";
		Assert.assertEquals(alertText,expAlertText);
		System.out.println("Alert Text Verified");
		
		// Accept the alert 
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		// Dismiss the alert 
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismiss");
		
		
		
		
		

	}

}
