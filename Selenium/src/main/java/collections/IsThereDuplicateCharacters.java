package collections;

import java.util.Map;
import java.util.TreeMap;


public class IsThereDuplicateCharacters {

	public static void main(String[] args) {
		
		// Lets write Psuedocode first
		// Goal ?? If there is repeating character -- then print false ; else true
		
		// 1, Convert the string to the character array(toCharArray())
		// 2, Loop through each character (use foreach)
		// 3, If the character is in map key then print duplicate and break (containsKey(""))
		// 4, If not add to the map (put(k,v))
		
		String companyName = "Hexaware";
			
		
		char[] allChars= companyName.toLowerCase().toCharArray();
		
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		boolean bDuplicate = false;
		for (char c : allChars) {
			
			if(map.containsKey(c)){
				bDuplicate = true;
				System.out.println("has Duplicate characters");
				break;
			}else{
				map.put(c, 1);
			}
		}
		if(!bDuplicate){
			System.out.println("all Unique Characters");
		}
		
		System.out.println(map);
	}

}
