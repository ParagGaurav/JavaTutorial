package javapackage.polymorphism;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading ov = new Overloading();
		ov.method1(7);
		ov.method1(2, 3);
		
		
		

	}
	
	public void method1(int x) {
		
		System.out.println(x);
		
		
	}
	
	public void method1(int x, int y) {
		
		System.out.println("The sum is : "+ (x+y));
		
		
		
		
	}

}
