import javax.swing.JOptionPane;
public class Aufgabe111 {
	public static void main(String args[]) {
		int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die erste Zahl ein");
		int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die zweiste Zahl ein");
		boolean istGleich = true;
		int sum = 0;
		if ((zahl1 < 0 && zahl2 >= 0)||(zahl1 >= 0) && (zahl2 < 0))
			istGleich = false;
		if istGleich {
			if (zahl1 < 0) 
					sume = -1 * zahl1 - -1