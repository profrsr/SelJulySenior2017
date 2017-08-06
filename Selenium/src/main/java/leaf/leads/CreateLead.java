package leaf.leads;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{

	//@Test(invocationCount = 2, threadPoolSize= 2)
	//@Test(timeOut = 10000)
	//@Test(invocationCount=2, invocationTimeOut=40000)
	//@Test(description = "Create a new lead",singleThreaded=true)//(invocationCount=2, timeOut=20000)
	@Test(dataProvider="cl") //(groups={"smoke"})
	public void createLead(String cn, String fn, String ln, String email, String phone) throws Exception{
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",cn);
		enterById("createLeadForm_firstName", fn);
		enterById("createLeadForm_lastName", ln);		
		enterById("createLeadForm_primaryEmail", email);
		enterById("createLeadForm_primaryPhoneNumber",phone);
	}
	@DataProvider(name="cl")
	public Object[][] dp(){
		return new Object[][]{
				{"TestLeaf","Babu","M","babu@testleaf.com","9500006373"},
				{"Qeagle","Gopinath","J","gopinath@testleaf.com","8328423882"}
		};
		
	}
	
	
	
	
	
	
	
	
	
	
	

}










