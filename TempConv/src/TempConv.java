import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class TempConv extends JApplet {
	double celsi;
	
	public void init() {
		celsi = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in celsius: "));
	}
	
	public void paint(Graphics g)
		{
			Font f = new Font ("DialogInput", Font.BOLD, 20);
	      	g.setFont (f);
			g.drawString("The temperature in Fahrenheit is " + (((9 * celsi) / 5) + 32) + "°F", 30, 30);
		}
}
