package javapackage.polymorphism;

public class Array6 {

	public static void main(String[] args) {
		
		int a[]= {2,4,7,9,-2,15,20,25,11,12,3};
		
		int b = Integer.MIN_VALUE;
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]>b) {
				b= a[i];
			}
			
		}
		System.out.println(b);

	}

}
