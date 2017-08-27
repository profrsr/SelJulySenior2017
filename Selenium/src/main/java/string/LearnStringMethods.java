package string;

import org.testng.annotations.Test;

public class LearnStringMethods {

	String txt = " TesteLeaf98789987 ";
	int num = 10;

	@Test
	public void learnStringMethods(){
		System.out.println(txt.length());
		System.out.println(txt.charAt(4));
		System.out.println(txt.charAt(6));		
		System.out.println(txt.concat("Automation"));
		System.out.println(Integer.toString(num));
		System.out.println(txt.concat(Integer.toString(num)));
		System.out.println(txt+num);
	//	txt.concat(num);	

		System.out.println(txt.substring(0, 2));
		System.out.println(txt.substring(3));
		System.out.println(txt.trim());
		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());

		String[] a = txt.split("e");
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(txt.indexOf("e"));
		System.out.println(txt.lastIndexOf("e"));
		System.out.println(txt.contains("teLe"));
		System.out.println(txt.replaceAll(" ", ""));

	}

}















