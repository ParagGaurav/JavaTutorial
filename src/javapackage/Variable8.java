package javapackage;

public class Variable8 {
	
	int b = 10; // Global variable
	static int c = 5; // static Variable 
			

	public static void main(String[] args) {
		
		int a = 6; // Local Variable 
		System.out.println(a); // 6
		
		//Static member calling
		System.out.println(c); //5
		d(); // 15
		System.out.println(Variable8.c); // 5
		Variable8.d(); // 15
		
		//Non Static member calling 
		Variable8 v8 = new Variable8();
		System.out.println(v8.b);
		v8.f();
		
		

	}
	public static void d () {
		int e = 15; // Local Variable 
		System.out.println(e); // 15
		
	}
	
	public void f() {
		
		int g = 5;// Local Variable
		System.out.println(g);
	}
	

}
