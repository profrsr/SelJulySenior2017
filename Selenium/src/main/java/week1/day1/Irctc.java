package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//classname object =new classname();
		ChromeDriver driver = new ChromeDriver();
		
		//object.methodName
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//maximize
		driver.manage().window().maximize();
		
		
		WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		
		Select dropdown = new Select(securityQ);
		
		//dropdown.selectByIndex(2);
		
		//dropdown.selectByValue("3");
		
		dropdown.selectByVisibleText("Who was your Childhood hero?");
		
		
	}

}
