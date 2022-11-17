import javax.swing.JOptionPane;

class Aufgabe333 {
	public static void main(String args[]) {

		final float pi = 3.14f;
		double r = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie r ein"));
		
		double umfang = 2 * pi * r;
		double flaeche = pi * r * r;
		
		JOptionPane.showMessageDialog(null, "Der Umfang von Kreis ist: " + umfang 
									+ "\nDie Fläche ist: " + flaeche);
	}
}
		