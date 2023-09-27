package javapackage;

public class Array4 {

	public static void main(String[] args) {

		// Defining multi dimensional Array

		int a[][] = { { 1, 2, 3, 7 }, { 4, 5, 6, 8 }, { 7, 8, 9, 6 } };

		// Total number of rows

		int row = a.length; // length is the property of an array
		System.out.println("Total Rows : " + row);

		// Total number of columns

		int columns = a[0].length; // length is the property of an array
		System.out.println("Total Rows : " + columns);

		// Print all data in matrix Form
		// Outer loop
		for (int i = 0; i < row; i++) {

			// Inner loop

			for (int j = 0; j < columns; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
