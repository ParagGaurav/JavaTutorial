package javapackage;

public class MethodOverload6 {
	
	public static void main(String[] args) {
		
		System.out.println(MethodOverload5.add(10, 20));
		System.out.println(MethodOverload5.add(10.5, 6.6));
		
		// Print A to Z
		
		for (char c = 'A'; c <= 'Z'; c++) {
			
			System.out.print(c + " ");
		}
	}

}
