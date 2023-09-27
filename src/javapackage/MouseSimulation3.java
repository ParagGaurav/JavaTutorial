package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		// switching Frame
		driver.switchTo().frame(0);
		System.out.println("Switch to frame");

		// Draggable web element

		WebElement Drag = driver.findElement(By.id("draggable"));

		// Dropable web element

		WebElement Drop = driver.findElement(By.id("droppable"));

		// Drag and Drop Using Actions class

		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(Drag,100,60).build().perform();
		
		// Drag the Web Element and click and hold using coordinates.
		Thread.sleep(2000);
		act.clickAndHold(Drag).dragAndDropBy(Drag,100,60).perform();
		
		
		

		

	}

}
