package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		// Ist Way
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id ='month']/option"));
		System.out.println("Total Drop down values : " + birthmonth.size());
		birthmonth.get(8).click();

		// 2nd Way

		WebElement bm = driver.findElement(By.xpath("//select[@id ='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");// Apr
		Thread.sleep(2000);
		month.selectByValue("12");
		Thread.sleep(2000);
		month.selectByIndex(7);
		System.out.println(month.getFirstSelectedOption().getText());

		// 3rd way
		List<WebElement> dropdown = month.getOptions();
		for (int i = 0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("sep")) {
				dropdown.get(i).click();
			}
		}

		// 4th way
		bm.sendKeys("jun");

		// 5th way

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id ='month']")).sendKeys("Mar");

		// check if dropdown support multi selection

		System.out.println(month.isMultiple()); // false
		month.selectByVisibleText("Apr");// Apr
		month.selectByValue("12");
		month.selectByIndex(7);
		
		
		// deselect the multi selected values
		
		month.deselectByVisibleText("Apr");// Apr
		month.deselectByValue("12");
		month.deselectByIndex(7);
		month.deselectAll();
		
		
		
		

	}

}
