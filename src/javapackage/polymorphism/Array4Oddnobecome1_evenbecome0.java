package javapackage.polymorphism;

public class Array4Oddnobecome1_evenbecome0 {

	public static void main(String[] args) {
		
		
			int a[] = { 1, 3, 2, 5, 7, 9, 8, 11, 15 };

			int b = 2;
			
			int c = 1;
			int d = 0;

			for (int i = 0; i < a.length; i++) {
				if (a[i]%b != 0) {
					
					a[i]= c;

					
					System.out.print(a[i] + " ");
					

				}else {
					a[i]=d;
					System.out.print(a[i] + " ");
				}

			}
			
			

		}

		
	}


