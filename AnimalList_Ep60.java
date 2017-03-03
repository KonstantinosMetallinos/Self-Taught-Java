
public class AnimalList_Ep60 {
	private Animal_Ep61[] thelist = new Animal_Ep61[5];
	private int i = 0;
	
	public void add(Animal_Ep61 a){
		if(i<thelist.length){
			thelist[i] = a;
			System.out.println("Animal added at index "+i);
			i++;			
		}	
	}
	

}
