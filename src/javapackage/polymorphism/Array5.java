package javapackage.polymorphism;

public class Array5 {

	public static void main(String[] args) {
		
		int a[]= {2,4,7,9,15,20,25,11,12,3};
		int b = 0;
		
		for(int i = 0; i<a.length;i++) {
			
			if(a[i]>b) {
				b = a[i];
				
			}
			
			
			
		}
		
		System.out.println(b);

	}

}
