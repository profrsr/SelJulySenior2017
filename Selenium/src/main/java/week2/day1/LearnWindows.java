package week2.day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Load URL
		driver.get("http://legacy.crystalcruises.com/");

		// Wait - Max 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Maximize the browser
		driver.manage().window().maximize();

		// Click on Link (GUEST CHECK-IN)
		driver.findElementByLinkText("GUEST CHECK-IN").click();

		// Get all the windows opened
		Set<String> allWindows = driver.getWindowHandles();

		// Print how many windows
		System.out.println(allWindows.size());

		// Print active window title
		System.out.println(driver.getTitle());

		// Print active window URL
		System.out.println(driver.getCurrentUrl());

		// Move through each window
		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow); // Switch from one window to another			
		}

		// Print active window title
		System.out.println(driver.getTitle());

		// Print active window URL
		System.out.println(driver.getCurrentUrl());

		//  close the new window 
		driver.close();
		
		// try printing the existing title after closed
		System.out.println(driver.getTitle()); // it throws NoSuchWindowException


	}

}
