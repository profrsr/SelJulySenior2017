package week2.day1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleElements {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Load URL
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");

		// Wait - Max 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Maximize the browser
		driver.manage().window().maximize();

		List<WebElement> allQuote = driver.findElementsByLinkText("Get-a-Quote");
		
		System.out.println(allQuote.size());
		
		
		allQuote.get(2).click();
		

	}

}
