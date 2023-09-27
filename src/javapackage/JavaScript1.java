package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://Facebook.com/");
		
		// java Script executer Interface
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='123abc'");
		
		// Scroll down using java script
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400)");
		// Scroll down using java script
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400)");
		

	}

}
