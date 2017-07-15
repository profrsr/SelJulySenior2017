package week2.day1;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearnSnap {

	public static void main(String[] args) throws InterruptedException, IOException {

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
		
		// Take Snap		
	    File src = driver.getScreenshotAs(OutputType.FILE);	
	    File dest = new File("./snaps/snap1.png");
		
		// Copy from the existing folder to another
	    FileUtils.copyFile(src, dest);

		// Move through each window
		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow); // Switch from one window to another			
		}
		
		// Take Snap		
	    File src1 = driver.getScreenshotAs(OutputType.FILE);	
	    File dest1 = new File("./snaps/snap2.png");
		
		// Copy from the existing folder to another
	    FileUtils.copyFile(src1, dest1);

		// Print active window title
		System.out.println(driver.getTitle());

		// Print active window URL
		System.out.println(driver.getCurrentUrl());

		//  close the new window 
		driver.close();


	}

}
