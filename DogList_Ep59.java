
public class DogList_Ep59 {
	private Dog_Ep61[] thelist = new Dog_Ep61[5];
	private int i=0;

	public void add(Dog_Ep61 d){
		if(i<thelist.length){
			thelist[i] = d;
			System.out.println("Dog added at index "+i);
			i++;
			
		}
		
		
	}
	
}
