
public class tuna_Ep46 {
	private String first;
	private String last; 
	private static int members = 0;	//static := every object shares the same variable
	
	public tuna_Ep46(String fn, String ln){
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the clud: %d\n", first, last, members);
	}
	
	// Ep 47
	public String getFirst(){
		return first;
	}
	
	public String getLast(){
		return last;
	}
	
	public static int getMembers(){
		return members;
	}
	
	
}
