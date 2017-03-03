import java.util.Scanner;

class Ep9 {
	public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);		
		int tuna = 5;
		int bass = 18;
		System.out.println(++tuna);	// ++tuna := add one to existing value (+=1) and then use it (pre-increment)			
		System.out.println(tuna++);	// tuna++ := use it and then add one to existing value (+=1) (post-increment)
		System.out.println(tuna);	// can be also used with subtraction (--)
		tuna += 5;					// tuna = tuna + 5 (+=) assignment operator 
									// Can also be used with multiplication *=
		System.out.println(tuna);	// can be also used with subtraction (--)
	}
}