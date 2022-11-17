class Aufgabe22 {
	public static void main(String args[]) {
		
		float wert1 = 0.1f;
		double wert2 = 100;
		System.out.println(wert1*100);
		System.out.println(wert1*wert2);
		
	}
}

/* wert1 * wert2 ergibt nicht 10.0 weil wert1 als 0.1f wird nicht exakt im Rechner dargestellt( als 1/2^n oder Dualsystem) 
	wenn man wert1 und wert2 multipliziert, wird wert1 zu double gecastet, daraus folgt Dateiverlust und kommt zu einem unexakten Ergebnis.
*/	


		