import javax.swing.JOptionPane;

class Aufgabe3 {
	public static void main(String args[]) {
	
		double a = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Kantelänge a ein"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie Kantelänge a ein"));
		
		double umfang = 2*(a + b );
		double flaeche = a * b;
		
		JOptionPane.showMessageDialog(null,"Der Umfang ist: " + umfang + "\nDie Fläche ist; " + flaeche);
	
	}
}