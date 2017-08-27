package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectableExample {
	
	@Test
	public void tryExample(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement Item1 = driver.findElementByXPath("//*[@id='selectable']/li[1]");
		WebElement Item4 = driver.findElementByXPath("//*[@id='selectable']/li[4]");
		Actions builder = new Actions(driver);
		builder.clickAndHold(Item1).release(Item4).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
