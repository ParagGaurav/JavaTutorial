package javapackage.polymorphism;

public class Pattern {
	

		public static void main (String [] args){

		int j , i;
		for (i = 1; i<=5;i++){

		for(j =1; j<=5-i; j++){

		System.out.print("*");;
		}
		for(j = i;j>=1;j--){
		System.out.print("#");
		}
		System.out.println();
		}
		}
		
		}



