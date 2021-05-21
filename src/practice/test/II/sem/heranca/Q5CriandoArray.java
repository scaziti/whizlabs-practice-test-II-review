package practice.test.II.sem.heranca;

public class Q5CriandoArray {

	public static void main(String[] args) {
		
		int[][] ints = new int[3][2];
		ints[0] = new int[3];
		ints[2] = new int[]{1,2,3}; // isso rola
		ints[2] = {1,2,3}; // erro de compilação
		
		
		System.out.println(ints[0].length + ints[2].length);
	}
}
