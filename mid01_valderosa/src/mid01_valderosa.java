import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class mid01_valderosa extends JApplet implements ActionListener{
	JLabel baseL, expoL, prodL;
	JTextField baseF, expoF, prodF;

	
	public void init() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		baseL = new JLabel("Enter base:");
		baseF = new JTextField(5);
		expoL = new JLabel("Enter expo:");
		expoF = new JTextField(5);
		prodL = new JLabel("Result:");
		prodF = new JTextField(8);
		
		c.add(baseL);
		c.add(baseF);
		c.add(expoL);
		c.add(expoF);
		c.add(prodL);
		c.add(prodF);
		
		baseF.addActionListener(this);
		expoF.addActionListener(this);
		prodF.addActionListener(this);
	}
	public void actionPerformed (ActionEvent y) {
		String baseIN = baseF.getText();
		String expoIN = expoF.getText();
		long baseA = Long.parseLong(baseIN);
		long expo = Long.parseLong(expoIN);
		long ans = exponent (baseA, expo);
		
		prodF.setText (Long.toString(ans));
	}
	public long exponent ( long baseA, long expo) {
	      if ( expo == 0 )  
	         return 1;
	      if (expo == 1)
	    	  return baseA;
	      else
	         return baseA * exponent ( baseA,(expo - 1));
	  }	
}
	


