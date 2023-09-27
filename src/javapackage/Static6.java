package javapackage;

public class Static6 {
	
	int x = 10; // Global Variable 
	static int y = 5; // static  Variable 
	
	
	//Non Static Method 
	
	public void a() {
		int z = 10; // local variable 
		System.out.println(z); //10 
		
	}
	
	static int b = 6; // static variable 
	
	//static method
	
	public static void b() {
		int a = 5; // local variable 
		System.out.println(a); //5
		
	}
	
	public static void main(String[] args) {
		Static6 s6 = new Static6();
		s6.a();
		System.out.println(s6.b); // Not appropriate way
		System.out.println(Static6.b); // appropriate way
		System.out.println(b); // correct way
	
		
	}

}
