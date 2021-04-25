import javax.swing.JOptionPane;


public class MultiArrayTest {


	public static void main(String[] args) {

		int total = 0;
		int a [] [] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++){
				total += a[i][j];
			}
		}
		JOptionPane.showMessageDialog(null, "Total: " + total);
		System.exit(0);
	}

}
