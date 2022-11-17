import javax.swing.JOptionPane;

class Aufgabe33 {
	public static void main(String args[]) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie bitte die Kantelänge a ein"));
		
		double volumen = a*a*a;
		double flaeche = 6*a*a;
		
		JOptionPane.showMessageDialog(null,"Die Volumen ist: " + volumen +
											"\nDie Fläche ist: " + flaeche);
											
	}
}