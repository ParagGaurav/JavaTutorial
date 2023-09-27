package javapackage;

public class UnaryOperator1 {

	public static void main(String[] args) {
		int a = 1 ; // Defining a local variable 
		
		System.out.println(a ++); //1,2
		System.out.println(a); // 2
		System.out.println(a ++);// 2,3
		System.out.println(++ a);// 4,4
		System.out.println(a);//4

	}

}
