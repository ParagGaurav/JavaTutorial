package javapackage;

public class Static1 {

	int x = 500; // Global Variable 
	String s = "Hello"; // Global Variable 
	static int y = 100; // static variable
	
	// static method
	public static void method1() {
		String x = "Hi"; // Local Variable 
		System.out.println(x); // Calling x variable 
	}
	
	// Non Static method 
	
	public void method2() {
		
		int i = 100; // Local Variable 
	}
	

	

}
