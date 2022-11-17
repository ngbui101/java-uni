class Aufgabe2 {
	public static void main(String args[]) {
		float wert1 = 1f/5, wert2 = 1/2f;
		double wert3 = 1.0/5, wert4 = 1/2.0;
		System.out.println(wert4 - wert2);
		System.out.println(wert3 - wert1);
	}
}

/* 
System.out.println(wert3 - wert1) nicht gleich 0 ergibt weil: 
		-wert1 hat die Wert 0,2 und 0,2 ist schwierig im Rechner (in Form von 1/2^n) dargestellt. Deswegen folgt auch die unexakte Darstellung
		-wert2 hat auch die Wert 0,2 aber wird genauer dargestellt als wert1 weil Typ double 64 Bit und somit mehr als Typ float 32 Bit im Computerspeicher zur Verfügung steht.
		-Bei (wert3 - wert1)  wird ein automatisch Typcasting durchgeführt, wert1 wird zu double gecastet aber nicht genauer dargestellt, deswegen kommt es zu einem Differemz.
*/