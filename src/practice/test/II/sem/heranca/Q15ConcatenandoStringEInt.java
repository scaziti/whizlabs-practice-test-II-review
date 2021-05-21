package practice.test.II.sem.heranca;

public class Q15ConcatenandoStringEInt {
	
	public static void main(String[] args) {
		
		int x = 1;
		int j = 2;
		
		System.out.println(x + j + "A"); // output: 3A
		System.out.println("A" + x + j); // output: A12
		System.out.println("A" + (x + j)); //output: A3
	}

}
