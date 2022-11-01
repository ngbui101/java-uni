import javax.swing.JOptionPane;
class Martikelnummer{
	public static void main(String args[]){
		
		int martikelNr = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihre Martikel-Nr ein"));
		int hilf = martikelNr;
		int querSum = 0;
		
		while (hilf > 0) { 
			int i = hilf%10;
			querSum += i;
			hilf = hilf / 10;
		}
		
		JOptionPane.showMessageDialog(null, "Ihre Martikel-Nr ist: " + martikelNr + "\nDie Quersumme davon ist: " + querSum);
		
	}
}
				
