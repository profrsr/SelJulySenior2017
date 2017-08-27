package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TryActions {
	
	@Test
	public void tryExample(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement draggable = driver.findElementByXPath("//*[@id='draggable']/p");
		WebElement droppable = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
