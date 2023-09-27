package javapackage;

public class FirstJavaProgram1 {
	
	int a = 5; // Global Variable or Class Variable 
	
	static int c = 10; // Static Variable
	
	//Short cut to write main method - Type 'ma' inside the class body 
	// Press ctrl+space from keyboard
	
	public static void main(String[] args) {
		
		// Shortcut to write System.out.println()
		// Type syso inside method body and press ctrl+space
		
		System.out.println("Hello Friends"); // Printing Strong Parameter 
		System.out.println("12345");
		System.out.println("Hello Automation Test Engineer");
		System.out.println("Hello Java");
		amethod();
		bmethod();
		
		int b = 6 ; // local Variable 
			
	}
	// User defined static method 
	public static void amethod() {
		
		System.out.println("Print a method");
	}
public static void bmethod() {
		
		System.out.println("Print b method");
		
		int d = 12; // local variable 
}

}
