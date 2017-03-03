import javax.swing.JOptionPane;

public class Ep50_GUI {
	public static void main(String args[]){
		
		String fn = JOptionPane.showInputDialog("Enter first Number");		//fn := first number
		String sn = JOptionPane.showInputDialog("Enter second  Number");	//sn:= first number
		
		int num1 = Integer.parseInt(fn);	//CONVERTS STRING INTO NUMBER
		int num2 = Integer.parseInt(sn);	//CONVERTS STRING INTO NUMBER
		int sum = num1 + num2 ;
		
		// first parameter where to position the message null:= put it in the middle of the screen
		// second parameter what do you want to say
		// third parameter is the title bar
		// fourth parameter the message that is going to pop up
		JOptionPane.showMessageDialog(null, "the answer is " + sum, "Insert Title Here :P", JOptionPane.PLAIN_MESSAGE);
		
		
	}
}
