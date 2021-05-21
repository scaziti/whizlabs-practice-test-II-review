package practice.test.II.sem.heranca;

public class Q18OutputComStatic {
	
	static int x = 2;
	
	public static void main(String[] args) {
		if( x > 1) {
			x++; // aqui eu tenho uma variável de classe
			int x = 4; // já aqui é apenas uma variável local
		}
		
		System.out.println(x); //portanto, a saída será da variável static, pois a local não existe nesse scopo
		final int x = 10;
		
		
		// Output: 3
	}

}
