package practice.test.II.sem.heranca;

public class Q8LancandoException {
	public static void main(String[] args) {
		
		new Q8LancandoException().meth();
	}
	
	public void meth() throws Exception	{
		System.out.println("A");
	}
	
	//Esse c�digo n�o compilar�, pois o m�todo lan�a uma exception. 
	//Portanto, preciso lan�ar a exception no m�todo que o chama
	// ou colocar em um try catch
}
