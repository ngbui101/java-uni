public class Aufgabe151 {
	public static void main(String args[]) {
		int anzahlAt = 0;
		int stelleAt = -1;
		boolean nureinEt = true,
				keinZeichenvor = false,
				keinZeichennach = false,
				istRichtig = false;
				
		String fehlermeldung = "",
			   fehlermeldung1 = "",
			   fehlermeldung2 = "",
			   fehlermeldung3 = "";
		System.out.println("Geben Sie Ihre E-Mail Adresse ein");
		String eingabe = new java.util.Scanner(System.in).nextLine();
		char[] charEingabe = eingabe.toCharArray();
		//Anzahl und stelle von @ rausnehmen und Großbuchstaben durch Kleinbuchstaben ersetzen
		for( int i = 0; i < charEingabe.length; i++) {
			if (charEingabe[i] ==  '@') {
				anzahlAt ++;
				stelleAt = i;
			}
			if (charEingabe[i] >= 65 && charEingabe[i] <= 90)
					charEingabe[i] += 32;
		}
		//richtig eingabe testen
		if (stelleAt == 0) {
			keinZeichenvor = true;
			fehlermeldung1 = "Es gibt kein Zeichen vor et";
			}else if (stelleAt == charEingabe.length) {
				keinZeichennach = true;
				fehlermeldung2 = "Es gibt kein Zeichen nach et";
				}else if (anzahlAt != 1) {
					nureinEt = false;
					fehlermeldung3 = "Es darf nur ein Et";  
				}
		if (keinZeichennach == false && nureinEt == true && keinZeichennach == false)
			istRichtig = true;
				
			
	
		//vor @ rausnehmen
		char[] vorChar = new char[charEingabe.length];
		char[] nachChar = new char[charEingabe.length];
		String vorText = "";
		String nachText = "";
		for(int i = 0; i < stelleAt; i++) {
			vorChar[i] = charEingabe[i];
			vorText += charEingabe[i];
		}
		//nach @ rausnehmen
		for (int i = stelleAt +1; i < charEingabe.length; i++){
			nachChar[i] = charEingabe[i];
			nachText = nachText + charEingabe[i];
		}
		//vergleichen ob bochum im String vorkommen
		String text = "bochum";
		char[] textBochum = text.toCharArray();
		boolean istBochum = false;
		
		for (int i = 0, j = 0; i < charEingabe.length; i++) {
			if (charEingabe[i] == textBochum[j])
				j++;
			if (j == textBochum.length) {
				istBochum = true;
				break;
			}
		}
		//die letzte 3 Zeichen
		String letztdreiZeichen = "";
		for (int i = charEingabe.length-4; i < charEingabe.length && istBochum; i++) {
			letztdreiZeichen = letztdreiZeichen + charEingabe[i];
			//System.out.println(charEingabe[i]); //test
		}
			
		//@ ersetzen
		String neuEmail = vorText+ "at" + nachText;
		//ausgabe
		if (istRichtig == false) 
			System.out.println(fehlermeldung1 + "\n" + fehlermeldung2 + "\n" + fehlermeldung3);
		else 
			System.out.printf("Email: %s%n" +
							"Was vor et steht: %s%n" +
							"Was nach et steht: %s%n" +
							"Ist \"bochum\" darin?: %s%n" +
							"Die letzten drei Zeichen: %s%n" +
							"Modifizierte Email: %s%n",
							eingabe, vorText, nachText, istBochum, letztdreiZeichen, neuEmail);
	}
}
							
							
								
			
	
			
		
	