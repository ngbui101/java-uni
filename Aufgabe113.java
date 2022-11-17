class Aufgabe113 {
	public static void main(String args[]) {
		String s1 = " ";
		String s2 = "||";
		for(int i = 0; i <= 6; i++) {
			for(int j = 0; j <= 6; j++) {
				if (i%2 != j%2) 
					System.out.print(s1);
				else 
					System.out.print(s2);
			}
			System.out.println();
		}
	}
}