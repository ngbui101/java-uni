import javax.swing.JOptionPane;
class Aufgabe1 {
	public static void main(String args[]) {
		
		String eingabe = JOptionPane.showInputDialog("Geben Sie ein ganze Zahl ein");
		int zahl = Math.abs(Integer.parseInt(eingabe));
		String ausgabe = "";
		boolean mehrAls3 = false;
	
		if (zahl < 10) 
			ausgabe = "00" + zahl;
			else if (zahl < 100)
				ausgabe = "0" + zahl;
				else if (zahl < 1000)
						ausgabe = "" + zahl;
					else mehrAls3 = true;
		
		if (mehrAls3) 
			JOptionPane.showMessageDialog(null, "Fehler");
		else 
			JOptionPane.showMessageDialog(null, ausgabe);
		
		System.exit(0);
	}
}