package leaf.listeners;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{

	@Test(invocationCount=10)
	public void createLead() throws Exception{
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","TL");
		enterById("createLeadForm_firstName", "Babu");
		enterById("createLeadForm_lastName", "N");		
		enterById("createLeadForm_primaryEmail", "babu@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber","9234923949");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}










