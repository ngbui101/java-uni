class Aufgabe4 {
	public static void main(String args[]) {
		for( int i = 10 ; i > 0; i--){
			for( int j = 10; j > 0; j--)
				System.out.printf("%d*%d = %d\t",i,j,i*j);
			System.out.println();
		}
	}
}