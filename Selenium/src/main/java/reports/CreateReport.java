package reports;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateReport {
	
	@Test
	public void htmlReport() {
		
		// At the Suite level >> @BeforeSuite
		ExtentReports reports = new ExtentReports("./report/result.html",false);
		File src = new File("./config.xml");
		reports.loadConfig(src);
		
		// At the testcase level >> @BeforeMethod
		ExtentTest test = reports.startTest("Delete Lead", "Delete an existing Lead");
	
		// At the step level >> replace with sysout in wrappers
		test.log(LogStatus.PASS, "Launch the browser", "The browser : chrome is launched");
		
		test.log(LogStatus.PASS, "UserName", "The username is entered");

		test.log(LogStatus.WARNING, "Password", "The password could not be entered");

		// @AfterMethod
		reports.endTest(test);
		
		// @AfterSuite
		reports.flush();
		
		
		
		
		
		
		
		
		
	}

}
