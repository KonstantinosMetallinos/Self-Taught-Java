import javax.swing.JFrame;		// gives basic windows features


public class Ep51_GUI_w_JFrame {
	public static void main(String args[]){
		tuna_Ep51 bucky = new tuna_Ep51();
		
		// VERY IMPORTANT TO INCLUDE!!! 
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//WHEN WE HIT THE X BUTTOM OUR PROGRAME WILL CLOSE  WILL CLOSE
		bucky.setSize(275,180);		//set size of our window
		bucky.setVisible(true);		// so we can see it
		
		
		
	}

}
