package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

import reports.Reports;

public class GenericWrappers extends Reports implements Wrappers{

	public RemoteWebDriver driver;
	int i=1;

	/**
	 * This method will launch the given browser and
	 *  maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Babu - TestLeaf
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @ 
	 * 
	 */
	public void invokeApp(String browser, String Url) {	
		
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(Url);
			log("PASS","Launch Browser","The browser: "+browser+" launched successfully");
		} catch (Exception e) {			
			//System.out.println("The browser: "+browser+" could not be launched");
			knowException(e);
		}
		finally{
			takeSnap();
		}		
	}
	
	public void knowException(Exception e){
		if(e instanceof NoSuchElementException){
			System.out.println();
		}
	}
	
	
	

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @throws Exception 
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterById(String idValue, String data){		
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+idValue);
		} catch (NoSuchElementException e) {
			System.out.println("The data: "+data+" could not be entered in the field :"+idValue);
		} catch (WebDriverException e){
			System.out.println("Unknown exception occured while entering "+data+" in the field :"+idValue);
		}		
		finally {
			takeSnap();
		}
	}

	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterByName(String nameValue, String data){
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :");
		} catch (NoSuchElementException e) {
			System.out.println("The data: "+data+" could not be entered in the field :"+nameValue);
		} catch (WebDriverException e){
			System.out.println("Unknown exception occured while entering "+data+" in the field :"+nameValue);
		}		
		finally{
			takeSnap();
		}
	}

	/**
	 * This method will enter the value to the text field using Xpath attribute to locate
	 * 
	 * @param XpathValue - Xpath of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterByXpath(String XpathValue, String data) {
		try {
			driver.findElementByXPath(XpathValue).clear();
			driver.findElementByXPath(XpathValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+XpathValue);
		} catch (NoSuchElementException e) {
			System.out.println("The data: "+data+" could not be entered in the field :"+XpathValue);
		} catch (WebDriverException e){
			System.out.println("Unknown exception occured while entering "+data+" in the field :"+XpathValue);
		}		
		finally{
			takeSnap();
		}
	}

	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Babu - TestLeaf
	 */
	public boolean verifyTitle(String title){
		boolean bReturn =false;
		try{
			if (driver.getTitle().equalsIgnoreCase(title)){
				System.out.println("The title of the page matches with the value :"+title);
			}else
				System.out.println("The title of the page:"+driver.getTitle()+" did not match with the value :"+title);
			bReturn =true;
		}catch (Exception e) {
			System.out.println("The title did not match");
		}
		finally {
			takeSnap();
		}
		return bReturn;
	}

	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Babu - TestLeaf
	 */
	public void verifyTextById(String id, String text) {

		try {
			String getText = driver.findElementById(id).getText();
			if(getText.equals(text)){
				System.out.println("The Text: "+text+ "matched with the Element");

			}
		} catch (NoSuchElementException e) {

			System.out.println("The Text: "+text+ "counld not matched");

		}
	}

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Babu - TestLeaf
	 */
	public void verifyTextByXpath(String xpath, String text){
		String sText = driver.findElementByXPath(xpath).getText();
		if (driver.findElementByXPath(xpath).getText().trim().equalsIgnoreCase(text)){
			System.out.println("The text: "+sText+" matches with the value :"+text);
		}else{
			System.out.println("The text: "+sText+" did not match with the value :"+text);
		}
	}

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Babu - TestLeaf
	 */
	public void verifyTextContainsByXpath(String xpath, String text){
		String sText = driver.findElementByXPath(xpath).getText();
		if (driver.findElementByXPath(xpath).getText().trim().contains(text)){
			System.out.println("The text: "+sText+" contains the value :"+text);
		}else{
			System.out.println("The text: "+sText+" did not contain the value :"+text);
		}
	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickById(String id){
		try{
			driver.findElement(By.id(id)).click();
			System.out.println("The element with id: "+id+" is clicked.");
		} catch (Exception e) {
			System.out.println("The element with id: "+id+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByClassName(String classVal) {
		try{
			driver.findElement(By.className(classVal)).click();
			System.out.println("The element with class Name: "+classVal+" is clicked.");
		} catch (Exception e) {
			System.out.println("The element with class Name: "+classVal+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByName(String name) {
		try{
			driver.findElement(By.name(name)).click();
			System.out.println("The element with name: "+name+" is clicked.");
		} catch (Exception e) {
			System.out.println("The element with name: "+name+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	/**
	 * This method will click the element using link name as locator
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 * @throws Exception 
	 */
	public void clickByLink(String name){
		try{			
			driver.findElement(By.linkText(name)).click();
			System.out.println("The element with link name: "+name+" is clicked.");
		} catch (Exception e) {
			System.out.println("The element with link name: "+name+" could not be clicked.");
			throw new RuntimeException("Element not found");
		}finally {
			takeSnap();
		}
	}

	/**
	 * This method will click the element using link name as locator and do not take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByLinkNoSnap(String name){
		try{			
			driver.findElement(By.linkText(name)).click();
			System.out.println("The element with link name: "+name+" is clicked.");
		} catch (Exception e) {
			System.out.println("The element with link name: "+name+" could not be clicked.");
		}
	}

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByXpath(String xpathVal) {
		try{
			driver.findElement(By.xpath(xpathVal)).click();
			System.out.println("The element : "+xpathVal+" is clicked.");
		} catch (Exception e) {
			System.out.println("The element with xpath: "+xpathVal+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Babu - TestLeaf
	 */
	public void clickByXpathNoSnap(String xpathVal) {
		try{
			driver.findElement(By.xpath(xpathVal)).click();
			System.out.println("The element : "+xpathVal+" is clicked.");
		} catch (Exception e) {
			System.out.println("The element with xpath: "+xpathVal+" could not be clicked.");
		}
	}

	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 * @author Babu - TestLeaf
	 */
	public String getTextById(String idVal) {
		String bReturn = "";
		try{
			bReturn = driver.findElement(By.id(idVal)).getText();
			System.out.println(bReturn);
		} catch (Exception e) {
			System.out.println("The element with ID: "+idVal+" could not be found.");
		}finally {
			takeSnap();
		}
		return bReturn;
	}

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Babu - TestLeaf
	 */
	public String getTextByXpath(String xpathVal){
		String bReturn = "";
		try{
			bReturn = driver.findElement(By.xpath(xpathVal)).getText();
			System.out.println(bReturn);
		} catch (Exception e) {
			System.out.println("The element with xpath: "+xpathVal+" could not be found.");
		}finally {
			takeSnap();
		}
		return bReturn;
	}

	/**
	 * This method will select the drop down value using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Babu - TestLeaf
	 */
	public void selectVisibileTextById(String id, String value) {

		try{
			new Select(driver.findElement(By.id(id))).selectByVisibleText(value);
			System.out.println("The element with id: "+id+" is selected with value :"+value);

		} catch (Exception e) {
			System.out.println("The value: "+value+" could not be selected.");
		}
		finally {
			takeSnap();
		}

	}

	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Babu - TestLeaf
	 */
	public void selectIndexById(String id, int value) {

		try{
			new Select(driver.findElement(By.id(id))).selectByIndex(value);;
			System.out.println("The element with id: "+id+" is selected with value :"+value);



		} catch (Exception e) {
			System.out.println("The value: "+value+" could not be selected.");
		}
		finally {
			takeSnap();
		}

	}

	/**
	 * This method will switch to the parent Window
	 * @author Babu - TestLeaf
	 */
	public void switchToParentWindow() {
		try{
			Set<String> wHandles = driver.getWindowHandles();
			for (String wHandle : wHandles) {
				driver.switchTo().window(wHandle);
				break;
			}
		}catch (Exception e) {
		}
		finally {
			takeSnap();
		}
	}

	/**
	 * This method will move the control to the last window
	 * @author Babu - TestLeaf
	 */
	public void switchToLastWindow() {
		try {
			Set<String> wHandles = driver.getWindowHandles();
			for (String wHandle : wHandles) {
				driver.switchTo().window(wHandle);				
			}
		} catch (Exception e) {
		}
		finally {
			takeSnap();
		}
	}

	/**
	 * This method will accept the alert opened
	 * @author Babu - TestLeaf
	 */
	public void acceptAlert(){
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
		}
		finally {
			takeSnap();
		}
	}

	/**
	 * This method will dismiss the alert opened
	 * @author Babu - TestLeaf
	 */
	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
		}
		finally {
			takeSnap();
		}		
	}

	/**
	 * This method will return the text of the alert
	 * @author Babu - TestLeaf
	 */

	public String getAlertText() {
		String txt = "";		
		try {
			txt = driver.switchTo().alert().getText();
		} catch (Exception e) {				
		}		
		return txt;
	}



	/**
	 * This method will take snapshot of the browser
	 * @author Babu - TestLeaf
	 */
	public void takeSnap() {
		File srcFile1 = driver.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./snaps/snap"+i+".jpeg");
		try {
			FileUtils.copyFile(srcFile1, destFile1);
		} catch (IOException e) {
			System.out.println("There was IO Exception while taking the SnapShot");
		}
		i++;
	}

	/**
	 * This method will close all the browsers
	 * @author Babu - TestLeaf
	 */
	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("Browser Closed");
		} catch (Exception e) {
			System.out.println("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.");
		}
	}	

	/**
	 * This method will close all the browsers
	 * @author Babu - TestLeaf
	 */

	public void closeAllBrowsers() {
		driver.quit();		
	}

}