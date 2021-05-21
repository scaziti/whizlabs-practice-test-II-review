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
		
		//Aqui não compila, pois como minha referencia de 'a' é Animal, o compilador chama
		// o método que lança uma exceptio, portanto, preciso utilizar o try/catch
		// ou lançar a mesma exceção no método que chama a classe Animal. Exemplo:
		try{
			a.eat();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
