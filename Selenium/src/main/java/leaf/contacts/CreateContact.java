package leaf.contacts;

import org.junit.Test;

import wrappers.LeafTapsWrapper;

public class CreateContact extends LeafTapsWrapper {

	@Test
	public void  createContact() throws Exception {
		login();		
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");
		closeBrowser();
	}	
}
