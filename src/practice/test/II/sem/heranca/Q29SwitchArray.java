package practice.test.II.sem.heranca;

public class Q29SwitchArray {

	public static void main(String[] args) {
		
		/*
		 * Apesar do array ser final, os valores dele n�o s�o. 
		 * Dessa forma, n�o consigo usar o valor contido no case, pois n�o s�o constantes
		 */
		final int array [] = new int[2];
		
		switch (2) {
		case array[0]:{
			System.out.println("A");
		}
		case array[1]:
			System.out.println("B");
		default:
			System.out.println("def");
			break;
		case array[2]:
			System.out.println("C");
		}
	}
}
