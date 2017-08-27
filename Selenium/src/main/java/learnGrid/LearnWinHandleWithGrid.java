package learnGrid;

import java.io.IOException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnWinHandleWithGrid {

	@Test
	public void sample() throws IOException{

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.46:4444/wd/hub"),dc);
				
		driver.get("http://legacy.crystalcruises.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println(allWindows.size());

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		String parentWindow = driver.getWindowHandle();

		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);			
		}

		System.out.println("*************************");
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
		
		


	}

}





































