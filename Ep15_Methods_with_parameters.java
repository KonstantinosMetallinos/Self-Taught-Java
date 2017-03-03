import java.util.Scanner;

public class Ep15_Methods_with_parameters {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		tuna_Ep15 tunaObject = new tuna_Ep15 ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
		
		
	}
}
