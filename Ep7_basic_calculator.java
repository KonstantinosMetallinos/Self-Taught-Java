import java.util.Scanner;

class Ep7 {
	public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);
		double first_number, second_number, answer;	// you can define multiple variables of the same type in one line
		System.out.println("Enter first number: ");
		first_number = bucky.nextDouble();  		// store a double value in here 
		System.out.println("Enter second number: ");
		second_number = bucky.nextDouble();  
		answer = first_number + second_number;
		System.out.println(answer);					// Note the (rounding?) error!!
	}
}