package javapackage;

public class Constructor2 {

	int id; // Global Variable
	String name; // Global Variable
	String address; // Global Variable

	// Default constructor

	Constructor2() {

		System.out.println("Hello Default Constructor");
	}

	// Parameterized constructor

	Constructor2(int a, String b, String c) {
		this.id = a;
		name = b;
		address = c;
	}
	Constructor2(char t, String u,String v){
		
		System.out.println(t + u + v);
	}

	// Non static method

	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {

		// Default constructor
		Constructor2 c2 = new Constructor2();

		// Parameterized constructor

		Constructor2 c3 = new Constructor2(1, "john", "london");
		c3.displayInfo();

		Constructor2 c4 = new Constructor2('a', "peter", "Dubai");
		c4.displayInfo();

	}

}
