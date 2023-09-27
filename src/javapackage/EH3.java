package javapackage;

public class EH3 {

	public static void main(String[] args) {

		String x = "Selenium";

		try {
			int i = Integer.parseInt(x);
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
		System.out.println("Exception Handled");

	}

}
