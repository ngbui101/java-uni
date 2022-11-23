import javax.swing.JOptionPane;

public class Aufgabe11{
	public static void main(String args[]) {
		int zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein"));
		char vorzeichen = ' ';
		int betrag = zahl;
		if (zahl < 0) {
			vorzeichen = '-';
			betrag = zahl * -1;
		}
		else if (zahl >0)
			vorzeichen = '+';
		JOptionPane.showMessageDialog(null, "Betrag: " + betrag +
									"\nVorzeichen: " + vorzeichen);
		
		System.exit(0);
	}
}
		