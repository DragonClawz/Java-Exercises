import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MQ1_valderosa extends JApplet implements ActionListener{
	JLabel rowL, colL;
	JTextField rowF, colF;
	JTextArea area;
	JScrollPane sroll;

	public void init(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		rowL = new JLabel("Row:");
		colL = new JLabel("Column:");
		rowF = new JTextField(7);
		colF = new JTextField(7);
		
		sroll = new JScrollPane(area = new JTextArea(20,45));
		
		c.add(rowL);
		c.add(rowF);
		c.add(colL);
		c.add(colF);
		//c.add(area);
		c.add(sroll);
		
		rowF.addActionListener(this);
		colF.addActionListener(this);
	}
	public void actionPerformed (ActionEvent y){
		int n = (Integer.parseInt(rowF.getText())) + 1;
		int m = (Integer.parseInt(colF.getText())) + 1;
		
		int[][] MulTabArray = new int [n] [m];
		
		for(int i = 1; i < MulTabArray.length; i++){
			for(int j = 1; j < MulTabArray[i].length; j++){
				MulTabArray[i][j] = (i * j);
				m = m + 1;
			}
		}
		for(int i = 1; i < MulTabArray.length; i++){
			for(int j = 1; j < MulTabArray[i].length; j++){
				area.append(MulTabArray[i][j] + "\t");
			}
			area.append("\n");
		}
	}
}


