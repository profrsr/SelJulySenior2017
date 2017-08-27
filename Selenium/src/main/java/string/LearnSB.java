package string;

public class LearnSB {
	
	public static void main(String[] args) {
		String a = "Testleaf";
		System.out.println("Memory address of a: "+ System.identityHashCode(a));
			
		
		a = a.concat(" Company");
		System.out.println("Memory address of a: "+ System.identityHashCode(a));

		StringBuffer b = new StringBuffer("Testleaf");
		System.out.println("Memory address of b: "+ System.identityHashCode(b));

		b.append(" Company");
		System.out.println("Memory address of b: "+ System.identityHashCode(b));

		
	}
	
}
