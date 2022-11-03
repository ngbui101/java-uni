class Arithmetik {
	public static void main (String args[]){
		int a,b,c,d; //ganze Zahlen
		double x,y,z; //reelle Zahlen
	String ausgabe;
		a = 6 * (3 - 1); b = 6 * 3 + 5;
		x = 16 / 5; y = 16 / 5.0; z = 16.0 / 5;
		c = 16 / 5; d = 16 % 5;
		ausgabe = "Das Ergebnis ist:\na = "+ a + "\nb = "+ b;
		ausgabe = ausgabe + "\nx = "+ x + "\ny = "+ y + "\nz = "+ z;
		ausgabe = ausgabe + "\nc = "+ c + "\nd = "+ d;
		System.out.println (ausgabe);
	}
}