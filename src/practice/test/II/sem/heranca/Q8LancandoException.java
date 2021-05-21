package practice.test.II.sem.heranca;

public class Q8LancandoException {
	public static void main(String[] args) {
		
		new Q8LancandoException().meth();
	}
	
	public void meth() throws Exception	{
		System.out.println("A");
	}
	
	//Esse código não compilará, pois o método lança uma exception. 
	//Portanto, preciso lançar a exception no método que o chama
	// ou colocar em um try catch
}
