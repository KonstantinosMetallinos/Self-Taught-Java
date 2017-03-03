
public class Ep55_Polymorphism {
	public static void main(String args[]){
		
		food_Ep55 bucky[]= new food_Ep55[2];	// bucky:= reference variable 
		bucky[0] = new potpie_Ep55();
		bucky[1] = new tuna_Ep55();
		
		for(int x=0;x<2;++x){
			bucky[x].eat();
		}
		
		// EPISODE Ep56
		System.out.println();
		fatty_Ep56 buckyy = new fatty_Ep56();
		food_Ep55 fo = new food_Ep55();
		food_Ep55 tu = new tuna_Ep55();
		
		buckyy.digest(fo);
		buckyy.digest(tu);
		
		
	}
}
