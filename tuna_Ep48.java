
public class tuna_Ep48 {
	private int sum;
	private final int NUMBER;	// constants are usually in CAPS
	
	public tuna_Ep48(int x){
		NUMBER = x; 
	}
	
	public void add(){
		sum+=NUMBER;		
	}
	
	public String toString(){
		return String.format("sum = %d\n", sum);		
	}
	
}
