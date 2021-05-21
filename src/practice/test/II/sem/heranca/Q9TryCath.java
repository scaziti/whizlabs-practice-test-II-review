package practice.test.II.sem.heranca;

public class Q9TryCath {
	public static void main(String[] args) {
		
		int x = 5, y = 10;
		
		try {
			y /= x; 
		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			System.out.println("Finally");
		}
		// Finally sempre vai rodar! Mesmo que pegue exceção!
		// Output: finally
	}

}
