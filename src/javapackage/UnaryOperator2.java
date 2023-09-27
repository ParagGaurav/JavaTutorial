package javapackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		int a = 10; // local variable 
		int b = 10; // Local variable
		
		System.out.println(a++);
		System.out.println(a++ + ++a);
		System.out.println(a + a++);
		System.out.println(b++ + b--);
		System.out.println(b++ + b--);
		System.out.println(b);
		

	}

}
