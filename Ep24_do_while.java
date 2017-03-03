
class Ep24_do_while {
	public static void main(String args[]){
		int counter = 20;
		
		do{								// Guarantees it will run AT LEAST once! 
			System.out.println(counter);
			counter++;
		}while(counter <= 10);		
	}	
}
