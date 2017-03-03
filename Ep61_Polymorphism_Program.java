
public class Ep61_Polymorphism_Program {
	public static void main(String args[]){
		
		Animal_Ep61[] thelist = new Animal_Ep61[2];
		Dog_Ep61 d = new Dog_Ep61();
		Fish_Ep61 f = new Fish_Ep61();
		
		thelist[0] = d;
		thelist[1] = f;
		
		for(Animal_Ep61 x: thelist){
			x.noise();
		}
		
	}
}
