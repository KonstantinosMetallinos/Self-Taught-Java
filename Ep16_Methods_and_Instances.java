import java.util.Scanner;

class Ep16_Methods_and_Instances {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		tuna_Ep16 tunaObject = new tuna_Ep16();
		System.out.println("Enter name of first girlfriend here: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
	
	}
}
