package practice.test.II.sem.heranca;

public class Q22LoopInfinito {
	
	public static void main(String[] args) {
		
		int[]a = {1,2,3,4,5,6};
		int i = a.length - 1; //Aqui receber� 6 - 1
		
		while (i > 0) {
			if (i == 2) continue;
			System.out.println(a[i]);
			i--;
		}
		
		// Perceba que o �ndice ir� de 6,5,4. Depois disso
		// i valer� 2 e o continue jogar� para o while sem imprimir nada
		// al�m de n�o ocorrer mais descrecimo do i, n�o saindo mais do while
	}

}
