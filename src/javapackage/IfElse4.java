package javapackage;

public class IfElse4 {

	public static void main(String[] args) {

		int age = 25; // local variable
		int weight = 55; // local variable

		// Outer if block
		if (age > 18) {

			// Inner if block
			if (weight > 50) {
				System.out.println("eligible");
			} else {
				System.out.println("Not eligible");
			}
		} else {
			System.out.println("Age is not greater than 18 ");
		}
	}

}
