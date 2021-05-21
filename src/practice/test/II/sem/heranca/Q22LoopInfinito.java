package practice.test.II.sem.heranca;

public class Q22LoopInfinito {
	
	public static void main(String[] args) {
		
		int[]a = {1,2,3,4,5,6};
		int i = a.length - 1; //Aqui receberá 6 - 1
		
		while (i > 0) {
			if (i == 2) continue;
			System.out.println(a[i]);
			i--;
		}
		
		// Perceba que o índice irá de 6,5,4. Depois disso
		// i valerá 2 e o continue jogará para o while sem imprimir nada
		// além de não ocorrer mais descrecimo do i, não saindo mais do while
	}

}
