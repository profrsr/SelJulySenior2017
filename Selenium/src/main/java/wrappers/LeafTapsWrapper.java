package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import excel.DataInputProvider;

public class LeafTapsWrapper extends GenericWrappers {
	
	public String sheetName;
	public String testcaseName;
	public String testDescription;

	@BeforeSuite
	public void createHtmlReport(){
		createReport();
	}
	
	
	
	
	@Parameters({"URL","Browser","UN","PWD"})
	@BeforeMethod(groups={"mandatory"})
	public void login(String url, String browser, String uName, String password) throws Exception {
		createTest(testcaseName,testDescription);
		invokeApp(browser, url);
		enterById("username", uName);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}



	@AfterMethod(alwaysRun=true,groups={"mandatory"})
	public void close() {
		closeBrowser();
		endReport();
	}
	
	@AfterSuite
	public void publishReport(){
		endTest();
	}
	
	
	@DataProvider(name="fetchData")
	public Object[][] dp1(){
		DataInputProvider dp = new DataInputProvider();
		return dp.readExcel(sheetName);

	}
}
