import javax.swing.JOptionPane;
public class Aufgabe111 {
	public static void main(String args[]) {
		int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die erste Zahl ein"));
		int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die zweiste Zahl ein"));
		/*
		boolean zahl1Negativ = false,
				zahl2Negativ = false;
		if (zahl1 < 0) {
			zahl1 *= -1;
			zahl1Negativ = true;
		}
		if (zahl2 < 0) {
			zahl2 *= -1;
			zahl2Negativ = true;
		}
		if (zahl1Negativ == false || zahl2Negativ == false){
			if (zahl1 > zahl2)
				System.out.println("Zahl 1 ist grosser als Zahl2 " + (zahl1 - zahl2));
			else 
				System.out.println("Zahl 2 ist grosser als Zahl1 " + (zahl2 - zahl1));
		}
		else 
			if (zahl1 < zahl2)
				System.out.println("Zahl 1 ist grosser als Zahl2 " + (zahl1 - zahl2));
			else 
				System.out.println("Zahl 2 ist grosser als Zahl1 " + (zahl2 - zahl1));
		*/
		int sub = zahl1 > zahl2 ? Math.abs(zahl1)-Math.abs(zahl2) : Math.abs(zahl2)-Math.abs(zahl1); 
		System.out.println(sub);
	
	}
}
		