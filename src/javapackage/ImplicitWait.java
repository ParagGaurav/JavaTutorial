package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how stuff works");
		
		// Handling Auto suggestion 
		
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role = 'listbox']/li"));
		for(int i = 0; i< AllSuggestions.size();i++ ){
			String expResult = "How stuff works quiz";
			if (AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
				AllSuggestions.get(i).click();
				break;
			}
		}
		

	}

}
