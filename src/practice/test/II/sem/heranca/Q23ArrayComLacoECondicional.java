package practice.test.II.sem.heranca;

public class Q23ArrayComLacoECondicional {
	
	public static void main(String[] args) {
		int [] a = {1,2,3};
		
		//Devido ao continue, qdo j valer 2 (a[1]), ele não vai executar o segundo for
		for (int j : a) {
			if (j == 2) continue;
				for (int x = 0; x < 3; System.out.println(x)) {
					x++;
				}
		}
		
		// Dessa forma, o output: 123123
		// Sem o continue, seria: 123123123
	}
	

}
