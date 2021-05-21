package practice.test.II.sem.heranca;

import java.util.Arrays;

public class Q6NullPointerArray {
	public static void main(String[] args) {
		
		// Terá uma excpetion, pois o array está iniciado com null, apenas!
		int[][] ints = new int[2][];
		
		Arrays.sort(ints[1]);
		
		System.out.println(Arrays.toString(ints[1]));
	}

}
