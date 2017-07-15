package week1.day2;

public class Bicycle {

	public int numWheels = 2; // class level variable and can be accessed by all methods
	
	public void doPedal(){
		//System.out.println(brand);
		int numGear = 4; // method level variable and can be accessed only by method
		System.out.println(numWheels);
		System.out.println("pedal");
	}
	
	public boolean isPuncture(){		
		//System.out.println(numGear);
		return true;
	}
	
	public String getColour(String brand){
		if (brand.equals("BSA")) {
			String color = "black"; // block level variable and can be accessed only by block		
			return "red";
		}else{
			//System.out.println(color);
			return "blue";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
