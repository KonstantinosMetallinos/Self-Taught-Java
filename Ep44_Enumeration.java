import java.util.EnumSet;

public class Ep44_Enumeration {
	public static void main(String args[]){
		
		for(tuna_ep44 people: tuna_ep44.values()){	// 1st: method, 2nd need something to use as a var for "description", 3rd :need an array, using method.values() that will make it loop throu each variable in that method
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		}
		
		// Ep 45
		System.out.println("\nAnd now for the range of constatnes\n");
		for(tuna_ep44 people: EnumSet.range(tuna_ep44.kelsey, tuna_ep44.candy)){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		}		
		
	}
}
