import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class RollDie extends JFrame {
	JFrame frame;
	JButton btn;
	JTextArea area;
	
	public RollDie() {
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setTitle("Roll Die 36,000 times");
		
		area = new JTextArea();
		btn = new JButton("Roll");
		
		btn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0, face;
						
						for (int i = 0; i < 36000; i++) {
							face = 1 + (int) (Math.random() * 6);
							
							switch(face) {
								case 1: face1++; break;
								case 2: face2++; break;
								case 3: face3++; break;
								case 4: face4++; break;
								case 5: face5++; break;
								case 6: face6++; break;
							}
						}
						area.setText("Face:\tFrequency:\tPercent\nFace 1:\t" + face1 + "\t" + ((double)(face1/36000) * 100) + "\nFace 2:\t" + face2 + "\t" + ((double)(face2/36000) * 100) + "\nFace 3:\t" + face3 + "\t" + ((double)(face3/36000) * 100) + "\nFace 4:\t" + face4 + "\t" + ((double)(face4/36000) * 100) + "\nFace 5:\t" + face5 + "\t" + ((double)(face5/36000) * 100) + "\nFace 6:\t" + face6 + "\t" + ((double)(face6/36000) * 100));
					}
				}
		);
		
		frame.add(area, BorderLayout.CENTER);
		frame.add(btn, BorderLayout.SOUTH);
		frame.setSize(300, 250);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		RollDie app = new RollDie();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

}
