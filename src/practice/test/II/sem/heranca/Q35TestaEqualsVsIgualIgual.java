package practice.test.II.sem.heranca;

public class Q35TestaEqualsVsIgualIgual {
	public static void main(String[] args) {
		
		Integer i = 10;
		Double d = 10.0;
		int ii = 10;
		double dd = 10.0;
		
		System.out.print(i.equals(d) + " "); // False, pois não são do mesmo tipo
		System.out.println(ii == dd); // True, pois possuem o mesmo valor
		
		Integer test1 = 10;
		Integer test2 = 10;
		
		System.out.println(test1.equals(test2)); //true
		System.out.println(test1 == test2); //true
		
		Integer x = new Integer(1);
		Integer j = new Integer(1);
		
		System.out.println(x.equals(j)); //true (valores iguais!!!)
		System.out.println(x == j); //false (objetos diferentes!!!)
		
		x = j;
		System.out.println(x == j); //true, pois apontam para o mesmo objeto!!!
		
		String s1 = "Ola";
		String s2 = "Ola";
		System.out.println(s1 == s2); // true
		String s3 = new String("Ola");
		System.out.println(s3.equals(s1)); //true
		System.out.println(s3 == s1); // false
	}

}
