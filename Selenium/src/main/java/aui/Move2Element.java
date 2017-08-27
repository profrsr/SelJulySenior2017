package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Move2Element {
	
	@Test
	public void tryExample() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement Item1 = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement Item4 = driver.findElementByXPath("//span[text()='Apple']");
		Actions builder = new Actions(driver);
		builder.moveToElement(Item1).perform();
		Thread.sleep(3000);
		builder.click(Item4).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
