
public enum tuna_ep44 {
	bucky("nice","22"),
	kelsey("cutie","10"),
	julia("bigmistake","12"),
	nicole("Italian", "13"),
	candy("different","14"),
	erin("I wish","16");
	
	
	
	private final String desc;  // final:= since we wont change anything,1st variable of the enums are desc:= description
	private final String year;	// second variable of the enums is year 
	
	tuna_ep44(String description, String birthday){
		desc = description;
		year = birthday;
		
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
	
}
