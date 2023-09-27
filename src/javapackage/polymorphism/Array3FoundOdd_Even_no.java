package javapackage.polymorphism;

public class Array3FoundOdd_Even_no {

	public static void main(String[] args) {

		int a[] = { 1, 3, 2, 5, 7, 9, 8, 11, 15 };

		int b = 2;
		
		int c = 0;
		int d = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i]%b != 0) {
				c = c+1;

				
				System.out.print(a[i] + " ");
				

			}else {
				d=d+1;
			}

		}
		System.out.println();
		System.out.println("Count of odd :: "+ c );
		System.out.println("count of even :: "+ d);
		

	}

}
