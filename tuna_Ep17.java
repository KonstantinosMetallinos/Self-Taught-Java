// Since there is no "main" here when called its confused
public class tuna_Ep17 {		// public class := call be called by other functions outside this class
	private String girlName;  	// private: only methods inside this class can use it
	
	public tuna_Ep17(String name){  	// Constructor added in Episode 17
		girlName = name;
	}
	
	public void setName(String name){
		girlName = name;
	}
	public String getName(){	// Since we want it to return something we don't put void
		return girlName;
	}
	public void saying(){
		System.out.printf("Your first girlfriend was %s", getName());	// %s := use "getName" String
	}
}
