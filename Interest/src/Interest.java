import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Interest extends JApplet implements ActionListener {
	JLabel prinL;
	JTextField prinF;
	JTextArea area;
	DecimalFormat two;
	
	String output = "Year\tAmount\n";
	int year = 10;
	double interest = 0.05, principal = 1000;
		
	public void init() {
		prinF = new JTextField(8);
		prinL = new JLabel("Principal");
		area = new JTextArea(11, 20);
		two = new DecimalFormat("Php #,##0.00");
	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		prinF.addActionListener(this);
		
		c.add(prinL);
		c.add(prinF);
		c.add(area);
	}
	
	public void actionPerformed(ActionEvent e) 
		{
			String input = prinF.getText();
			principal = Double.parseDouble(input);
			area.setText(output);
			for(int i = 1; i <= year; i++)
				{
					area.append(i + "\t" + two.format(principal * Math.pow(1 + interest, i)) + "\n");
				}
		}
	}