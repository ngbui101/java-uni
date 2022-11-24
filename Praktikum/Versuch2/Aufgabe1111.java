import javax.swing.JOptionPane;
public class Aufgabe1111 {
	public static void main(String args[]) {
		int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die erste Zahl ein"));
		int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die zweiste Zahl ein"));
		int sub = 0;
		if(zahl1 > 0 && zahl2 > 0) {
				if(zahl1 > zahl2)
						sub = zahl1 - zahl2;
				else 
						sub = zahl2 - zahl1;
		}else if(zahl1 < 0 && zahl2 < 0) {
				if(zahl1 > zahl2)
					sub = zahl1 * -1 - zahl2 * -1;
				else 
					sub = zahl2 * -1 - zahl1 * -1;
			}else if(zahl1 >= 0 && zahl2 < 0)
				sub = zahl1 - zahl2*-1;
				else
					sub = zahl2 - zahl1*-1;
		System.out.println(sub);
	}
}
				