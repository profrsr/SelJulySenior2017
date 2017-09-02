package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetToList {

	public static void main(String[] args) {

		Set<String> cmp = new TreeSet<String>();

		cmp.add("KLA");
		cmp.add("Amazon");
		cmp.add("Paypal");
		cmp.add("Microsoft");

		// Sort alphabetic
		for (String string : cmp) {
			System.out.println(string);
		}
		
		List<String> lst = new ArrayList<String>();		
		lst.addAll(cmp);		
		for (int i =lst.size()-1; i >=0; i--) {
			System.out.println(lst.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}