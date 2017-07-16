package week2.day2;

public class Bicycle {
	
	
	public int numWheels = 2; // class level variable and can be accessed by all methods

	/*
	 * 
	 */
	public void doPedal(){
	}
	
	
	/*
	 * 
	 */
	public boolean isPuncture(){		
		return true;
	}
	
	/**
	 * Overloading 
	 * 
	 * Same method signature but different arguments
	 * 1) Number of arguments can be different
	 * 2) Same number of arguments but different input type
	 * 
	 * Overloading applies only to the class
	 */

	/**
	 * Get the colour of the bicycle based on the brand
	 */
	public String getColour(String brand){
		if (brand.equals("BSA")) {
			return "red";
		}else{
			return "blue";
		}
	}
	
	public String getColour(int cycleNumber){
		if(cycleNumber == 3535){
			return "blue";
		}else{
			return "white";
		}
	}
	
	// 2
	public String getColour(String brand, String type){
		if (brand.equals("BSA") && type.equals("exercise")) {
			return "red";
		}else if (brand.equals("BSA") && type.equals("sports")) {
			return "black";
		}else{
			return "blue";
		}
	}
	
	public String getColour(String brand, int CycleNumber){
		if (brand.equals("BSA") && CycleNumber == 834821) {
			return "red";
		}else if (brand.equals("BSA") && CycleNumber == 3284823) {
			return "black";
		}else{
			return "blue";
		}
	}
	
	
	
	// 3
	public String getColour(){
			return "red";
	}
	
	










}
