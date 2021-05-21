package practice.test.II.sem.heranca;

public class Q3AnonymousArray {

	public static void main(String[] args) {
		
		Integer [] x = new Integer[] {1,2,3,4};
		
		
		teste(new Integer[] {1,2,3}); // note que passei o array diretamente de forma anonima (anonymous array)
		teste(x); // já aqui, passei um array instanciado
	}
	
	static void teste(Integer[] x) {
		for (int a : x) {
			System.out.print(a + " ");
		}
	}
}
