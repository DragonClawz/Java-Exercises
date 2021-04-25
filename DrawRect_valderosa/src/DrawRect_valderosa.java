import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DrawRect_valderosa extends JApplet {
	
	 int width = Integer.parseInt(JOptionPane.showInputDialog("Input width: "));
	 int height = Integer.parseInt(JOptionPane.showInputDialog("Input height: "));
	 int x = Integer.parseInt(JOptionPane.showInputDialog("Input x-coordinate: "));
	 int y = Integer.parseInt(JOptionPane.showInputDialog("Input y - coordinate: "));
	 
	 public void paint(Graphics g) {
		 g.drawRect(x, y, width, height);
	 }
}
