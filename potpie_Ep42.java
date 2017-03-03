
public class potpie_Ep42 {
	private int month, day, year;
	
	public potpie_Ep42(int m, int d, int y){
		month = m; day = d; year = y;
		
		System.out.printf("The constructor for this is %s\n", this);  
		// when you reference an object in the String format with this it goes to the toString
	}
	
	public String toString(){	// any time you need a String representation "look here"
		return String.format("%d/%d/%d", month, day, year);
	}
	
	// ########################### EPISODE 43 ############################
	
}
