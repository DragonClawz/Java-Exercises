import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class pex1_valderosa {

	public static void main(String[] args) {
		
		DecimalFormat yas = new DecimalFormat("#,##0.00");
		int ans = 1;
		
		do {
				String choice = JOptionPane.showInputDialog("Input A if conversion from °F to °C\nInput B if conversion from °C to °F\nInput C to Exit Program");
				switch(choice) {
				case "A":
				case "a":
					double F = Double.parseDouble(JOptionPane.showInputDialog("Input temperature in Fahrenheit: "));
					double Ca = (((F - 32) * 5) / 9);
					JOptionPane.showMessageDialog(null, "Conversion:\n" + yas.format(F) + " °F\n" + yas.format(Ca) + " °C");
					ans = Integer.parseInt(JOptionPane.showInputDialog("Would you like to continue? 1 - Yes / 2 - No"));
					break;
				case "B":
				case "b":	
					double Ce = Double.parseDouble(JOptionPane.showInputDialog("Input temperature in Celcius: "));
					double Fa = (((Ce * 9)/5) + 32);
					JOptionPane.showMessageDialog(null, "Conversion:\n" + yas.format(Ce) + " °C\n" + yas.format(Fa) + " °F");
					ans = Integer.parseInt(JOptionPane.showInputDialog("Would you like to continue? 1 - Yes / 2 - No"));
					break;
				case "C":            
				case "c":
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Invalid Choice", "Try Again", JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
		} while (ans == 1);
	}
}

                             