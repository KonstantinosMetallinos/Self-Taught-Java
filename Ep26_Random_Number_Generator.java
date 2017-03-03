import java.util.Random;

class Ep26_Random_Number_Generator {
	public static void main(String args[]){
		Random dice = new Random();
		int number;
		for(int counter=1; counter <= 10; counter++){
			number = 1 + dice.nextInt(6);	// argument 1: number of different numbers 6: 0-5
			System.out.println(number);
		}		
	}
}
