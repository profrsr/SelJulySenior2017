package leaf.leads;

import org.testng.annotations.Test;

public class LearnPriority {
	
	//@Test(priority = -2)
	@Test(invocationCount = 10,successPercentage=80)
	public void walk() {
		
	}
	
	@Test(dependsOnMethods="walk")//(priority = -1)
	public void run() {

	}
	
}
