package javapackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// Tab Handling

		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();

		// Get the total number of open tabs / Windows

		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);

		Iterator<String> abc = allWindowsID.iterator();
		String win1 = abc.next();
		String win2 = abc.next();

		// Print the title of parent window
		driver.switchTo().window(win1);
		System.out.println("Parent window Id: + win1"); // alphanumeric id of parent window
		System.out.println(driver.getTitle()); // Title of parent window

		// Print the current Url of child tab

		Thread.sleep(2000);
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println("Child Tab ID :- " + win2); // Alphanumeric Id of child window
		System.out.println(driver.getCurrentUrl()); // Current Url of child tab

		// Step-2 Windows/pop-up handling
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();

		// print the title of child window

		Thread.sleep(2000);
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println("Child window id: " + win2); // Alphanumeric id of child window 
		System.out.println(driver.getTitle()); // get title of child window 
		Thread.sleep(2000);
		driver.quit(); // Close parent Window as well as associated window
		System.out.println("Window pop-up and Tab handled");

	}

}
