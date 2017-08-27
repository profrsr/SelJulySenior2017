package learnStatic;

import org.testng.annotations.Test;

public class CallStatic {
	
	@Test
	public void sample(){
		System.out.println(LearnStatic.txt);
		LearnStatic.sample1();
	}

}
