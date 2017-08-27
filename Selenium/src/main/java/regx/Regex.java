package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {	
	
	
	public static void main (String args[]){
		
		String pattern = "[a-zA-Z0-9]+@[a-zA-Z]{3,}.[a-z]{3}";
		
		Pattern p = Pattern.compile(pattern);
			
		Matcher match = p.matcher("gopinath@testleaf.com");
		System.out.println(match.matches());
		
		
		
		
		
		
	}
	}


