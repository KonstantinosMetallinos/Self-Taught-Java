
public class Ep39_Multiple_Constructors {
	public static void main(String args[]){

	//################# EPISODE 41 ######################
		tuna_Ep39 tunaObject = new tuna_Ep39();
		tuna_Ep39 tunaObject2 = new tuna_Ep39(5);
		tuna_Ep39 tunaObject3 = new tuna_Ep39(5,13);
		tuna_Ep39 tunaObject4 = new tuna_Ep39(5,13,43);
		
		System.out.printf("%s\n", tunaObject.toMilitary());
		System.out.printf("%s\n", tunaObject2.toMilitary());
		System.out.printf("%s\n", tunaObject3.toMilitary());
		System.out.printf("%s\n", tunaObject4.toMilitary());
		
	}
}
