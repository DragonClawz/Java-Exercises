import javax.swing.JOptionPane;


public class mid03_valderosa {
	static int d1;
	static int d2;
	static int d3;
	static int d4;
	static int d5;
	static int input;
	
	public static void main(String[] args) {
		
		input = Integer.parseInt(JOptionPane.showInputDialog("Input 5 digit integer:"));
		
		if (input > 9999 && input < 100000) {
			d1 = input / 10000;
			d2 = input % 10000 / 1000;
			d3 = input % 10000 % 1000 / 100;
			d4 = input % 10000 % 1000 % 100 / 10;
			d5 = input % 10000 % 1000 % 100 % 10;
			
			if (d1 == d5 || d2 == d4){
				JOptionPane.showMessageDialog(null, "Number " +input+ " is a palindrome");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "Number " +input+ " is not a palindrome");
				System.exit(0);
			}
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Please input 5 digit integer");
			input = Integer.parseInt(JOptionPane.showInputDialog("Input 5 digit integer:"));
			MethodHere();
		}
	}
	public static void MethodHere(){
		
		if (input > 9999 && input < 100000) {
			
			d1 = input / 10000;
			d2 = input % 10000 / 1000;
			d3 = input % 10000 % 1000 / 100;
			d4 = input % 10000 % 1000 % 100 / 10;
			d5 = input % 10000 % 1000 % 100 % 10;
			
			if (d1 == d5 || d2 == d4){
				JOptionPane.showMessageDialog(null, "Number " +input+ " is a palindrome");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "Number " +input+ " is not a palindrome");
				System.exit(0);
			}
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Please input 5 digit integer");
			input = Integer.parseInt(JOptionPane.showInputDialog("Input 5 digit integer:"));
			MethodHere();
		}
	}
}
		