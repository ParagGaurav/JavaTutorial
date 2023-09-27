package javapackage;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsappandyoutube {

	public static void main(String[] args) throws InterruptedException {
		
			{

				// Setting the Property of chrome browser and passingchrome driver path

				System.setProperty("webdriver.chrome.driver",
						"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");

				// Launching chrome Browser Instance

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://web.whatsapp.com/");
				Thread.sleep(2000);
				      
				((JavascriptExecutor)driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));
				driver.get("https://www.youtube.com/");

	}

}
}
