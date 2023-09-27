package javapackage;

public class Constructor3 {

	// Constructor Overloading

	Constructor3() {

		System.out.println("No arg Constructor");
	}

	Constructor3(int a) {
		System.out.println("int arg Constructor");

	}

	Constructor3(String b) {

		System.out.println("String arg Constructor");
	}

	public static void main(String[] args) {

		Constructor3 c3 = new Constructor3();
		Constructor3 c4 = new Constructor3(1);
		Constructor3 c5 = new Constructor3("Hello");
	}

}
