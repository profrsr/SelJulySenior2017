package string;

import org.testng.annotations.Test;

public class printNextChar {

	@Test
	public void sample() {		
		String txt = "Test";
		String finalChar="";
		for (int i = 0; i < txt.length(); i++) {
			char singChar = txt.charAt(i);
			System.out.println(singChar);
			int ascii = singChar+1;
			System.out.println(ascii);
			char nextChar = (char) ascii;
			finalChar = finalChar+nextChar;
		}
		System.out.println(finalChar);
	}
	
	@Test
	public void sample1(){
		String txt = "ABC";
		char[] x = txt.toCharArray();
		for (int i = 0; i < x.length; i++) {
			int num = (int)txt.charAt(i);
			char var = (char)(num+1);
			System.out.print(var);
		}
		System.out.println();			
	}
}
