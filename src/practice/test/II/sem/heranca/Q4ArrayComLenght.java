package practice.test.II.sem.heranca;

public class Q4ArrayComLenght {

	public static void main(String[] args) {
		
		final int[] ints = new int[3];
		int len = ints.length;
		ints[1]++; //o valor padr�o � 0, ent�o na posi��o 1, informo que ser� 1 na pr�xima linha;
		for (int i : ints) {
			System.out.print(i + " ");
		}
		
		//output ser�: 010
	}
}
