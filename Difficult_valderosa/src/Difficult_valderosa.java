import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Difficult_valderosa{
	
	public static void main (String args[]){
		
		DecimalFormat yas = new DecimalFormat("#,##0.000");
		double meter = Double.parseDouble(JOptionPane.showInputDialog("Input length in meters: "));
	
		JOptionPane.showMessageDialog(null ,"Centimeter: " + yas.format((meter * 100)) + " cm\nInch: " + yas.format((meter*39.3701)) + " inch");
	}

}
