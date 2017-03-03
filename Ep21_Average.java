import java.util.Scanner;

public class Ep21_Average {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);		// System.in := Keyboard
		int total = 0, grade, average, counter = 0;	// Initialise variables
		
		while(counter < 10){
			System.out.println("Enter the " + ++counter + " grade");
			grade = input.nextInt();	// temporarily store in grade
			total = total + grade;		// keeps total of grades
			//counter++;
		}
		average = total/counter;		// compute the average
		System.out.println("Your average is " + average);
	}
}
