import javax.swing.JOptionPane;

class Aufgabe2 {
	public static void main(String args[]) {
		
		String eingabe = JOptionPane.showInputDialog("Geben Sie ein Farbe ein");
		String ausgabe ="";
		
		switch (eingabe) {
			case "Gelb" : ausgabe = "123456789";
				break;
			case "Blau" : ausgabe = "Nguyen Lam";
				break;
			case "Rosa" : ausgabe = "Bui";
				break;
			default : ausgabe = "-1";
		}
		
		JOptionPane.showMessageDialog(null,ausgabe);
		System.exit(0);
	}
}
			