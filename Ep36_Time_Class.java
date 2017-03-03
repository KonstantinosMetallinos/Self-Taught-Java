
public class Ep36_Time_Class {
	public static void main(String args[]){
		tuna_Ep36 tunaObject = new tuna_Ep36();
		System.out.println(tunaObject.toMilitary());
		
		tunaObject.setTime(13, 27, 6);
		System.out.println(tunaObject.toMilitary());

	}
}
