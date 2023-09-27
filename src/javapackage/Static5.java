package javapackage;

public class Static5 {
	static int z = 5; // static Variable 
	int y = 1; // Global Variable 
	
	//Static Method
	
	public static void a() {
		
		z = 10;
		System.out.println(z); // 10 
		
	}
	// Non Static Method
	
	public void b() {
		
		z = 15;
		System.out.println(z);
		a();
	}
	public static void main(String[]args) {
		a();
		Static5 s5 = new Static5();
		s5.b();
	}

}
