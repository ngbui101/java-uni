import javax.swing.JOptionPane;
class Matrikelnummer{
	public static void main(String args[]){
		int matrikelNr = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihre Martikel-Nr ein"));
		int hilf = matrikelNr;
		int querSum = 0;
		
		while (hilf > 0) { 
			int i = hilf%10;
			querSum += i;
			hilf = hilf / 10;
		}
		
		JOptionPane.showMessageDialog(null, "Ihre Martikel-Nr ist: " + matrikelNr + "\nDie Quersumme davon ist: " + querSum);
		
	}
}
				