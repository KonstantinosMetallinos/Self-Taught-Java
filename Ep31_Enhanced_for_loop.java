
class Ep31_Enhanced_for_loop {
	public static void main(String args[]){
		int bucky[] = {3,4,5,6,7}, total = 0;
		
		for(int x: bucky){		//for(type identifier: name of array){...} - Enhanced for loop
			total+=x;
		}
		
		System.out.println(total);		
	}
}
