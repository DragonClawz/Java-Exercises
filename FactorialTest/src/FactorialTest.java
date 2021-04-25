import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JTextArea;


public class FactorialTest extends JApplet{
	JTextArea area;
	public void init() {
		Container c = getContentPane();
		area = new JTextArea();
		
		for (int i = 0; i <= 10; i++) {
			area.append(i + "!: " + factorial(i) + "\n");
		}
		c.add(area);
	}
	
	public long factorial(long n) {
		if(n <= 1) 
			return 1;	
		else 
			return n * factorial(n-1);
	}

}
