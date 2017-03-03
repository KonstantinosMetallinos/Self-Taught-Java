import java.awt.FlowLayout;
import java.awt.event.ActionListener;	// used to wait until user pressed Enter or something 
import java.awt.event.ActionEvent;
import javax.swing.JFrame;	
import javax.swing.JTextField;			// can use you type text 
import javax.swing.JPasswordField;		// can use to type text but covered in "*****" 
import javax.swing.JOptionPane;

public class tuna_Ep52 extends JFrame{
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public tuna_Ep52(){		// since this is a constructer anything in here is the window 
		super("The title");		//title 	
		setLayout(new FlowLayout());		// our Layouts 
		
		item1 = new JTextField(10);			
		item2 = new JTextField("Enter tect here");			
		item3 = new JTextField("uneditable",20);			
		item3.setEditable(false); // make item 3 not editable 
		add(item1);				// add item 1 to window
		add(item2);
		add(item3);
		
		passwordField = new JPasswordField("mypass");	// will appear in *'s ie *******
		add(passwordField);
		
		// EPISODE 53
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}	// end of constructer
	
	private class thehandler implements ActionListener{	// this is the class that will handle the events
		
		public void actionPerformed(ActionEvent event){
			
			String string = "";	// string with small s is just a variable, can be named anything
						
			if(event.getSource()==item1)
				string=String.format("field 1: %s", event.getActionCommand());	// getActionCommand:= get text in that location
			else if(event.getSource()==item2)
				string=String.format("field 2: %s", event.getActionCommand());	// getActionCommand:= get text in that location
			else if(event.getSource()==item3)
				string=String.format("field 3: %s", event.getActionCommand());	// getActionCommand:= get text in that location
			else if(event.getSource()==passwordField)
				string=String.format("password field is: %s", event.getActionCommand());
				
			// EPISODE 54
			JOptionPane.showMessageDialog(null, string); 	// 			
		}
		
		
	}
	
	
	
	
	
	
	
}
