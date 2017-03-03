import java.util.Scanner;

class Ep8 {
	public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);
		int girls, boys, people,people2,people3,people4,people5;	// if you divide and store answer as int, you get the answer with the decimal as null!!
		girls = 11;
		boys = 3;
		people = girls + boys;	// plus: +
		people2 = girls - boys;	// minus: -
		people3 = girls * boys;	// multiply: *
		people4 = girls / boys;	// divide: /
		people5 = girls % boys;	// modulus: % := remainder 
		System.out.println(people);
		System.out.println(people2);
		System.out.println(people3);
		System.out.println(people4);
		System.out.println(people5);		
	}
}