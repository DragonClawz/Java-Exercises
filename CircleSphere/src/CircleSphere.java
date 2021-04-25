import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CircleSphere {

	public static void main(String[] args) {
		
		DecimalFormat kai = new DecimalFormat("#,##0.000");

		double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius: ")), dia = 2 * radius, circumc = 2 * Math.PI * radius, areac = Math.PI * Math.pow(radius, 2), volsp = 4 * Math.PI * Math.pow(radius, 3)/3;
		JOptionPane.showMessageDialog(null, 
				"Radius = " + kai.format(radius) + 
				"\nDiameter of Circle = " + kai.format(dia) + 
				"\nDiameter of Sphere = " + kai.format(dia) + 
				"\nCircumference of Circle = " + kai.format(circumc) + 
				"\nArea of Circle = " + kai.format(areac) + 
				"\nVolume of Sphere = " + kai.format(volsp));

		System.exit(0);
	}

}
