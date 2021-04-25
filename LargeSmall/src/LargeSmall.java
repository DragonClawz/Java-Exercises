import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class LargeSmall extends JApplet{
	int num1, num2, num3, num4, num5, large = 0, small = 0;
	
	public void init () {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 3: "));
		num4 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 4: "));
		num5 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 5: "));
		
		if (num1 > large)
			large = num1;
		if (num2 > num1) 
			large = num2;
		if (num3 > num2) 
			large = num3;
		if (num4 > num3) 
			large = num4;
		if (num5 > num4)
			large = num5;
		
		if (num2 < num1) 
			small = num2;
		if (num3 < num2) 
			small = num3;
		if (num4 < num3) 
			small = num4;
		if (num5 < num4) 
			small = num5;
		if (num1 < num5)
			small = num1;
	}
	
	public void paint(Graphics g) {
		Font f = new Font ("DialogInput", Font.BOLD, 20);
		g.setFont (f);
		g.drawString("Numbers: " + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5, 25, 25);
		g.drawString("Largest Number: " + large,  25, 40);
		g.drawString("\nSmallest Number: " + small , 25, 55);
	}
}