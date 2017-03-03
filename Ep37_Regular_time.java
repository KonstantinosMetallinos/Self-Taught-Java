
public class Ep37_Regular_time {
	public static void main(String args[]){
		tuna_Ep36 tunaObject = new tuna_Ep36();
		System.out.println(tunaObject.toMilitary());
		System.out.println(tunaObject.toString());
		
		tunaObject.setTime(13, 27, 6);
		System.out.println(tunaObject.toMilitary());

		System.out.println(tunaObject.toString());

		
	}
}
