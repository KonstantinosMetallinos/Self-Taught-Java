import java.awt.FlowLayout;	// how things are going to be placed, default Layout
import javax.swing.JFrame; 	// all basic Windows features for our GUI
import javax.swing.JLabel;	// output text and images on screen 


public class tuna_Ep51 extends JFrame{
	
	private JLabel item1;
	
	public tuna_Ep51(){
		super("The tile bar");	// the tile of the window
		setLayout(new FlowLayout());	//give default layout
		
		item1 = new JLabel("this is a sentance");
		item1.setToolTipText("This is gona show up on hover");		// what we want to show up if we hover the mouse over
		add(item1);		//adds item1 to the window. 		
	}	
	
}
