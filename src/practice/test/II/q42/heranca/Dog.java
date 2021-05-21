package practice.test.II.q42.heranca;

public class Dog extends Animal{

	public void eat(){
		System.out.println("Dog eats");
	}
	
	public static void main(String[] args) {
		
		Animal a = new Dog();
		
		Dog d = new Dog();
		
		d.eat();
		
//		a.eat();
		
		//Aqui n�o compila, pois como minha referencia de 'a' � Animal, o compilador chama
		// o m�todo que lan�a uma exceptio, portanto, preciso utilizar o try/catch
		// ou lan�ar a mesma exce��o no m�todo que chama a classe Animal. Exemplo:
		try{
			a.eat();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
