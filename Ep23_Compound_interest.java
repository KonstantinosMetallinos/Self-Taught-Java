
class Ep23_Compound_interest {
	public static void main(String args[]){
		double amount, principal = 10000, rate = 0.01;

		for(int day=1;day<=20;day++){
			amount = principal*Math.pow(1 + rate, day);  //Math.pow := a^b w/ a:= 1st arg and b:= 2nd arg
			System.out.println(day + "  " + amount);			
		}		
	}
}