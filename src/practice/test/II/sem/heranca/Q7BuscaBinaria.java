package practice.test.II.sem.heranca;

import java.util.Arrays;

public class Q7BuscaBinaria {
	public static void main(String[] args) {
		
		int[] ints = {2,-1,4,5,3};
		Arrays.sort(ints);
		//Aqui ele vai buscar dentro do array em qual posi��o est� -1 (no caso, na posi��o 0)
		System.out.println(Arrays.binarySearch(ints, -1));
	}

}
