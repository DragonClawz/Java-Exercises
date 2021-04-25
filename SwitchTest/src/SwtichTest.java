import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class SwtichTest extends JApplet {
	
	int choice;
		
	public void init() {
		choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to draw lines\nEnter 2 to draw rectangles\nEnter 3 to draw ovals\n"));
	}
	
	public void paint (Graphics g) {		
		
		for(int i = 0; i < 10; i++) {
			switch(choice) {
			case 1:
				g.drawLine(10, 10, 250, 10 + i * 10);
				showStatus("Draw Lines");
				break;
			case 2:
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				showStatus("Draw Rectangles");
				break;
			case 3:
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				showStatus("Draw Ovals");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid Choice", "Try Again", JOptionPane.WARNING_MESSAGE);
				System.exit(0);
				
			}
		}
	}
}
