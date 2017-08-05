package leaf.leads;



import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{
	
	//@Test(invocationCount = 2, threadPoolSize= 2)
	//@Test(timeOut = 10000)
	//@Test(invocationCount=2, invocationTimeOut=40000)
	@Test(description = "Create a new lead",singleThreaded=true)//(invocationCount=2, timeOut=20000)
	public void abc() throws Exception{
		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Qeagle");
		enterById("createLeadForm_firstName", "Gopinath");
		enterById("createLeadForm_lastName", "Jayakumar");		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByName("submitButton");
		
	}
}









