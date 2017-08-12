package reports;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {

	public static ExtentReports reports;
	public static ExtentTest test;
	
	public void log(String status, String stepName, String desc){
		if(status.equals("PASS"))
			test.log(LogStatus.PASS, stepName, desc);
		else if(status.equals("FAIL")){
			test.log(LogStatus.FAIL, stepName, desc);
			throw new RuntimeException();
		}else if(status.equals("WARN"))
			test.log(LogStatus.WARNING, stepName, desc);
	}

	public void createReport(){
		reports = new ExtentReports("./report/result.html",false);
		File src = new File("./config.xml");
		reports.loadConfig(src);
	}

	public void endReport(){
		reports.endTest(test);
	}

	public void createTest(String tcName, String testDesc){
		test = reports.startTest(tcName, testDesc);
	}


	public void endTest(){
		reports.flush();
	}



}
