package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		// Find Total number of frames present 
		
		int allframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames : " + allframes);
		
		// Go inside each frame and check if the element is present
		
		for(int i=0; i<allframes; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'watch video')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'close')]")).click();
		}

	}

}
