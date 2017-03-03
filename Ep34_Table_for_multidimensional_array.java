
public class Ep34_Table_for_multidimensional_array {
	public static void main(String args[]){
		int first_array[][]={{8,9,10,11},{12,13,14,15}};
		int second_array[][]={{30,31,32,33},{43},{4,5,6}};
		
		System.out.println("This is the first array");
		display(first_array);
		System.out.println();
		
		System.out.println("This is the second array");
		display(second_array);		
	}
	
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+ "\t");
			}
			System.out.println();
		}
	}
}
