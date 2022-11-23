class Fibonacci {
	static int fiBonacci(int a) {
		if (a == 1 || a == 0) 
				return a;
		else if ( a < 0 )
				return -1;
		else  
			return (fiBonacci(a - 2) + fiBonacci(a - 1));
	}
	public static void main (String args[]) {
		for ( int i = 0; i <= 10; i++) {
			System.out.println(fiBonacci(i));
		}
		
	}
}
