package practice.test.II.sem.heranca;

public class Q4ArrayComLenght {

	public static void main(String[] args) {
		
		final int[] ints = new int[3];
		int len = ints.length;
		ints[1]++; //o valor padrão é 0, então na posição 1, informo que será 1 na próxima linha;
		for (int i : ints) {
			System.out.print(i + " ");
		}
		
		//output será: 010
	}
}
