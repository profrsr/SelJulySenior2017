package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//object.methodName
		driver.get("https://www.irctc.co.in");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//maximize
		driver.manage().window().maximize();
		
		
		driver.findElementById("loginbutton").click();
		/*Alert ialert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(ialert.getText());
		ialert.accept();
		*/
		driver.findElementById("usernameId").sendKeys("testleaf");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
