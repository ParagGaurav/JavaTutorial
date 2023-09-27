package javapackage;

public class UnaryOperator3 {

	public static void main(String[] args) {
		
		int a = 10; // local variable 
		int b = 10; // Local variable 
		
		System.out.println(a++); // 10,11
		System.out.println(a++ + ++a); // 11,12,13,13
		System.out.println(b++ + ++b);// 10,11,12,12
		System.out.println(b++ + b++);//12,13,13,14
		System.out.println(b);//14
		System.out.println(a++ + b++); //13,14,14,15
		
		
	}

}
