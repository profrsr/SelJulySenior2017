package week2.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallConst {

	public static void main(String[] args) {

		// Constructor -> First block to be called when object created
		LearnConstructor lc = new LearnConstructor("Babu");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//WebDriver driver;
		
		
		
	}

}
