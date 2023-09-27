package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]"));
		Thread.sleep(2000);

		// Create Electronics web element reference

		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Mouse Simulation using actions class

		Actions act = new Actions(driver);

		// Mouse Hover to Electronics

		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		
		// keyboard Operations
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		act.sendKeys(fash,Keys.ENTER).build().perform();
		System.out.println("Fashion Option Clicked.");
		
		// Right clicked on the web page
		Thread.sleep(2000);
		act.contextClick().build().perform();

	}

}
