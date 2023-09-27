package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://money.rediff.com/gainers");

		// Create list - All Companies

		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class ='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies : " + allcompanies.size());

		// Create List - current Price

		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class ='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Price : " + currentPrice.size());

		String expCompanyName = "Ecoplast L";

		for (int i = 0; i < allcompanies.size(); i++) {

			if (allcompanies.get(i).getText().equalsIgnoreCase(expCompanyName)) {
				System.out.println(allcompanies.get(i).getText() + "===" + currentPrice.get(i).getText());
				allcompanies.get(i).click();
				break;

			}

		}

	}

}
