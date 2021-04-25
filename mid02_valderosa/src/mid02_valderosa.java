import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class mid02_valderosa extends JApplet implements ActionListener {
	JLabel ansL, quest;
	JTextField ansF;
	int num1 = 0, num2 = 0, pro = 0;
	
	public void init(){
		ansL = new JLabel("Answer:");
		ansF = new JTextField(8);
		
		num1 = 1 + (int) (Math.random() * 10);
		num2 = 1 + (int) (Math.random() * 10);
		
		JOptionPane.showMessageDialog(null , "How much is " + num1 + " times " + num2 + "?");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		ansF.addActionListener(this);
		
		c.add(ansL);                                                                                                                               
		c.add(ansF);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String input = ansF.getText();
		int ansF0 = Integer.parseInt(input);
		
		pro = num1 * num2;

		if (pro == ansF0) {
			showStatus("Very  Good!");
			MethodHere();
		}
		else {
			showStatus("No, Please try again.");
			JOptionPane.showMessageDialog(null , "How much is " + num1 + " times " + num2 + "?");
		}
	}
	public void MethodHere() {
		num1 = 1 + (int) (Math.random() * 10);
		num2 = 1 + (int) (Math.random() * 10);
		
		JOptionPane.showMessageDialog(null , "How much is " + num1 + " times " + num2 + "?");
	}
}
	
	