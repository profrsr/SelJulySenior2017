package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */


	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//object.methodName
		driver.get("http://jqueryui.com/draggable/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//maximize
		driver.manage().window().maximize();

		//WebElement demo = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(0);

		String txt = driver.findElementByXPath("//*[@id='draggable']/p").getText();
	


		System.out.println(txt);
		
		driver.switchTo().defaultContent();		
		
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
		
		
		

































	}

}
