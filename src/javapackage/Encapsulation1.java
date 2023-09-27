package javapackage;

public class Encapsulation1 {

	String name; // Global Variable
	int b; // Global Variable
	final int c = 2; // Final variable

	// Final Variable
	public void a() {

		// c = 5; // final variable can not change the value.
	}

	// final method

	final void d() {
		System.out.println("final method");
	}

	public void setName(String s) {
		
		this.name = s;
		this.b = 5;
		System.out.println(b);
		System.out.println(c);

	}
	public Object getName() {
		
		return name;
		
	}

}
