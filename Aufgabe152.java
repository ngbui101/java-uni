import javax.swing.*;
public class Aufgabe152 {
	public static void main(String args[]) {
		String name1, name2;
		char[] arrName1, arrName2;
		//eingabe
		name1 = JOptionPane.showInputDialog("Geben Sie einen Name ein");
		name2 = JOptionPane.showInputDialog("Geben Sie zweiten Name ein");
		
		//String in Array alles größ schreiben
		arrName1 = trim(toUpperCase(name1.toCharArray()));
		arrName2 = trim(toUpperCase(name2.toCharArray()));
		int differenz = compare(arrName1, arrName2);
		//test
		System.out.println(differenz);
		for(int i = 0; i < arrName1.length; i++) {
			System.out.print(arrName1[i]);
		}
		
	}
	public static char[] toUpperCase(char[] a) {
		for( int i = 0; i < a.length; i++)
			if (a[i] >= 97 && a[i] <= 122) 
					a[i] -= 32;
		return a;
	
	}
	public static int compare(char[] a, char[] b) {
		int differenz = 0;
		for(int i = 0; i < (Math.min(a.length,b.length)); i++) 
			if (a[i] != b[i]) {
				differenz = a[i] - b[i];
				break;
			}
		return differenz;
	}
	public static char[] trim(char[] a) {
		char[] hilf = new char[a.length];
		for(int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != 32 || j >= 1) {
				hilf[j] = a[i];
				j++;
			}
		}
		return hilf;
	}
}	
		