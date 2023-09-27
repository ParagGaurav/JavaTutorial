package javapackage.polymorphism;

public class Array2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7,8,9};
		
		int b = 0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==5) {
				b = 1;
				
			}
			
			
		}
		
		if(b == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
	  
		
		
		

	}

}
