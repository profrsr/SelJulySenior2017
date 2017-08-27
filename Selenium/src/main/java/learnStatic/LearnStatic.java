package learnStatic;

import org.testng.annotations.Test;

public class LearnStatic {

	static String txt ="TestLeafNew";
	
	@Test
	public void sample(){
		sample1();
		txt = "Babu";
		System.out.println(txt);
	}
	
	public static void sample1(){
		
		LearnStatic lc = new LearnStatic();
		lc.sample();
		System.out.println("TestLeaf");
		//sample();
	}


}
