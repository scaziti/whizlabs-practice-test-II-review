package practice.test.II.sem.heranca;

public class Q19VariaveisStatics {
	static int x = 2;
	static int z;
	
	public static void main(String[] args) {
		
		// output: 5
		System.out.println(x + z);
	}
	
	// Por ser static, vai iniciar antes da chamada do main
	static {
		int x = 3; // Como declaro aqui uma nova variável, não é o mesmo x static acima
		z = x; // por outro lado, chamo o z static e atribuo o valor do x local
	}
	


}
