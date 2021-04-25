import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ArithmeticApplet extends JApplet {
	
	double a, b;
	DecimalFormat yas = new DecimalFormat("#,##0.000");
				
	public void init() {		
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Enter input 1: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Enter input 2: "));	
	}
		
	public void paint (Graphics g) {
			
		Font f = new Font ("DialogInput", Font.BOLD, 15);
		g.setFont (f);
		g.drawString("Additon: " + yas.format((a + b)), 25, 25);
		g.drawString("Subtraction: "	+ yas.format((a - b)), 25, 40);
		g.drawString("Multiplication: " + yas.format((a * b)), 25, 55);
		g.drawString("Division: " + yas.format((a / b)), 25, 70);
		g.drawString("Modulo Division: "+ yas.format(( a % b)), 25, 85);
	}
}




