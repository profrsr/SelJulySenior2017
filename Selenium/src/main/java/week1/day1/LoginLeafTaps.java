package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeafTaps {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//classname object =new classname();
		ChromeDriver driver = new ChromeDriver();
		
		//object.methodName
		driver.get("http://leaftaps.com/opentaps");
		
		//maximize
		driver.manage().window().maximize();
		
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		String user = driver.findElementByTagName("h2").getText();
		
		System.out.println(user);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
