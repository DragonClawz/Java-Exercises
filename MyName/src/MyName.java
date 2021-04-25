import javax.swing.JOptionPane;

public class MyName {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Name: ");
		JOptionPane.showMessageDialog(null, name + "\nBS Electronics and Communications Engineer\nAteneo de Davao University", "My Name", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
