import java.util.Scanner;
class Decbin {
	public static void main(String[] args) {
		
		double doubZ;
		String b = ".";
		Scanner myScanner = new Scanner(System.in);
		String eingabe = myScanner.nextLine();
		doubZ = Double.parseDouble(eingabe);
		int vorKomma = (int)doubZ;
		double nachKomma = doubZ - vorKomma;
		
		
		while (vorKomma > 0) {
			int i = vorKomma % 2;
			b = i + b	;
			vorKomma /= 2;
		}
		
		while (nachKomma != 1.0) {
			double j = nachKomma * 2;
			if (nachKomma == 0) {
				b = b + "0"; 
				break;
			}
			if (j < 1) {
				b = b + "0";
				nachKomma *= 2;
			}
			else {
				b = b + "1";
				nachKomma = j - 1.0;
				if (nachKomma == 0) {
			//		System.out.println(nachKomma);
					break;
				}
			}
		} 			
		System.out.println(b);
		//System.out.println(Integer.toBinaryString((int)doubZ));
	}
}