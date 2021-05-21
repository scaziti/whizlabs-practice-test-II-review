package practice.test.II.sem.heranca;

public class Q28FinalESwitch {
	public static void main(String[] args) {
		
		/*
		 * Note que x vale -1, pois se valer 1, terá duplicidade de valores no case
		 * Por exemplo, teria x + 1 (= 2) e y (que também vale 2)
		 * Além disso, precisa ser final, pois para utilizar variável no case, precisa ser constante
		 * 
		 */
		final int x = -1;
		final int y = 2;
		
		switch(x+y) {
			case x + 1:{
				System.out.println("A");
			}
			case 1:
				System.out.println("B");
			default:
				System.out.println("def");
				break;
			case y:
				System.out.println("C");
		}
	}

}
