package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		// 1st way 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); // Female 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); // male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); // custom
		
		
		// 2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio buttons : " + radios.size());
		System.out.println(radios.get(0).isSelected()); // false
		System.out.println(radios.get(1).isEnabled()); // true
		System.out.println(radios.get(2).isDisplayed()); // true
		Thread.sleep(2000);
		radios.get(1).click();
		Thread.sleep(2000);
		System.out.println(radios.get(2).isSelected()); // False 
		
		// 3rd way
		
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total radio buttons :" + radios1.size());
		String expResult = "Female";
		for(int i =0; i <radios1.size();i++) {
			if (radios1.get(i).getText().equalsIgnoreCase(expResult)) {
				radios1.get(i).click();
				System.out.println(expResult  + "Clicked");
				break;
			}else {
				System.out.println("Not clicked");
			}
		}
		
		
		

	}

}
