package string;

import org.testng.annotations.Test;

public class Occurance {

	String check = "Cognizanta";
	int Count = 0;

	//Way1
	
	public void findOccurance() {		
		
		char[] charArray = check.toCharArray();
		for (char c : charArray) {
			if(c=='a'){
				Count++;
			}
		}
		System.out.println(Count);
	}
	
	
	//Way2
	
	public void sample(){
		for (int i = 0; i < check.length() ; i++) {
			if(check.charAt(i)=='a'){
				Count++;
			}
		}
		System.out.println(Count);
		
	}
	
	
	//Way3 
	@Test
	public void sample1(){
		System.out.println(check.length()-check.replaceAll("a", "").length());
	}
	
	//way4
	public void sample2(){
		if(check.endsWith("a")){
			System.out.println(check.split("a").length);
		}else{
			System.out.println(check.split("a").length-1);
		}
		
	}
	
	

}










