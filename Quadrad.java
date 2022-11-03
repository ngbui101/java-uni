import javax.swing.JOptionPane;

public class Quadrad {
	public static void main(String args[]) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Seitelänge"));
		
		double volumme = a * a * a;
		double flaeche = 6 * a * a;
		
		JOptionPane.showMessageDialog(null,"Die Volumme ist: " + volumme + "\nDie Fläche ist: " + flaeche);
		System.exit(0);
	
	}
}