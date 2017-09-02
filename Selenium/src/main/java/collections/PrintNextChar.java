package collections;

public class PrintNextChar {

	public static void main(String[] args) {

		// Given Leaf, Print Mfbg
		String given = "1A2B";

		char[]  ch = given.toCharArray();		
		for (char c : ch) {			
			int val =(int) c;
			System.out.print(((char) (val+1)));
		}
	}
}