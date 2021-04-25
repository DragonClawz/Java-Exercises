import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class pex2_valderosa extends JApplet implements ActionListener{
	JLabel fnumL, snumL;
	JTextField fnumF, snumF;
	int num1, num2;

	public void init(){
		fnumL = new JLabel("First Number");
		fnumF = new JTextField(5);
		snumL = new JLabel("Second Number");
		snumF = new JTextField(5);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		fnumF.addActionListener(this);
		snumF.addActionListener(this);
		
		c.add(fnumL);
		c.add(fnumF);
		c.add(snumL);
		c.add(snumF);
	}
	
	public void actionPerformed (ActionEvent e) {
		String input = fnumF.getText();
		String input1 = snumF.getText();
		num1 = Integer.parseInt(input);                                                                                                                                                                                                                                                                                                                                                       
		num2 = Integer.parseInt(input1);
		if ((num1 % num2) == 0) {
			showStatus(num1 + " is a multiple of " + num2);
		}
		else {
			showStatus(num1 + " is not a multiple of " + num2);
		}
	}
}
