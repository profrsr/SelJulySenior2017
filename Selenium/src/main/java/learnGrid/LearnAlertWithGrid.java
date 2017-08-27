package learnGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnAlertWithGrid {

	@Test
	public void sample() throws MalformedURLException{
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.MAC);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.46:4444/wd/hub"),dc);
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.findElementById("loginbutton").click();
		
		System.out.println(driver.getTitle());
		
		//SwitchTo Alert
		Alert alt = driver.switchTo().alert();
		
		//Get the Text
		String txt = alt.getText();
		
		System.out.println(txt);		
		
		
		
		
		
		//Accept alert
		alt.accept();
		
		

	}

}












