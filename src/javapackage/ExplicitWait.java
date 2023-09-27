package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//  Enter Username 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		
		//Fetch Attribute Value
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		
		// height of imput box
		
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		
		// width of imput box
		
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		// Use Explicit wait to check
		
		WebDriverWait wt = new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("Pass"))).sendKeys("abcd");
	

	}

}
