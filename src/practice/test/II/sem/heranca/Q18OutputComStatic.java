package practice.test.II.sem.heranca;

public class Q18OutputComStatic {
	
	static int x = 2;
	
	public static void main(String[] args) {
		if( x > 1) {
			x++; // aqui eu tenho uma vari�vel de classe
			int x = 4; // j� aqui � apenas uma vari�vel local
		}
		
		System.out.println(x); //portanto, a sa�da ser� da vari�vel static, pois a local n�o existe nesse scopo
		final int x = 10;
		
		
		// Output: 3
	}

}
