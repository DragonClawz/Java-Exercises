import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class pex3_valderosa extends JApplet implements ActionListener {

	JLabel x1L, x2L, y1L, y2L, diL;
	JTextField x1F, x2F, y1F, y2F, diF;
	JButton J;
	DecimalFormat two = new DecimalFormat("#,##0.00");
	double x1, x2, y1, y2, dist;
	
	public void init() {
		x1L = new JLabel("X1");
		x1F = new JTextField(8);
		y1L = new JLabel("Y1");
		y1F = new JTextField(8);
		x2L = new JLabel("X2");
		x2F = new JTextField(8);
		y2L = new JLabel("Y2");
		y2F = new JTextField(8);
		diL = new JLabel("Distance: ");
		diF = new JTextField(10);
		
		J = new JButton("Calculate");
		J.addActionListener(this);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(x1L);
		c.add(x1F);
		c.add(y1L);
		c.add(y1F);
		c.add(x2L);
		c.add(x2F);
		c.add(y2L);
		c.add(y2F);
		c.add(diL);
		c.add(diF);
		c.add(J);
	}
	
	public void actionPerformed(ActionEvent e) {
		String input1 = x1F.getText();
		String input2 = x2F.getText();
		String input3 = y1F.getText();
		String input4 = y2F.getText();
		
		x1 = Double.parseDouble(input1);
		x2 = Double.parseDouble(input2);
		y1 = Double.parseDouble(input3);
		y2 = Double.parseDouble(input4);
		
		dist = Math.sqrt((Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2)));
		diF.setText(two.format(dist));
		
	}
}
