import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class interest2 {

	public static void main(String[] args) {

		DecimalFormat yas = new DecimalFormat("P #,##0.000");
		double interest, principal, amount;
		int year;
		
		JTextArea area = new JTextArea(20,30);
		JScrollPane scroll = new JScrollPane(area);
		
		principal = Double.parseDouble(JOptionPane.showInputDialog("Enter Principal Amount: "));
		interest = Double.parseDouble(JOptionPane.showInputDialog("Enter Interest Rate: "));
		year = Integer.parseInt(JOptionPane.showInputDialog("Enter Compounding Year: "));
		
		String output = ("Principal:\t\t" + yas.format(principal) + "\nInterest (%): \t\t" + interest + "%\nCompounding Year: \t" + year + "\n\nYear\t\tAmount\n");
		
		area.setText(output);
		
		for(int i = 1; i <= year; i++) {
			amount = principal * Math.pow(1 + interest / 100, i);
			area.append(i + "\t\t" + yas.format(amount) + "\n");
		}
		
		JOptionPane.showMessageDialog(null, scroll, "Compound Interest", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}

}
