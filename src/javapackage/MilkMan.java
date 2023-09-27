package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MilkMan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dms-aaryadairy-test.mrmilkman.in/");
		
		driver.findElement(By.xpath("//input[@id = 'loginform-username']")).sendKeys("Parag1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'loginform-password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name = 'login-button']")).click();
		
		
		
		
		
		
		
		
		


	}

}
