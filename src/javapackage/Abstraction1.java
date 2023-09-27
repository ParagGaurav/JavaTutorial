package javapackage;

public abstract class Abstraction1 {

	static int a = 5; // static Variable
	int b = 5; // Global Variable
	final int c = 10; // final Variable
	
	// abstract method
	
	abstract void eat();
	
	// Non abstraction Method 
	
	public void a() {
		
		System.out.println("Non Abstract method");
	}
	
	
}

