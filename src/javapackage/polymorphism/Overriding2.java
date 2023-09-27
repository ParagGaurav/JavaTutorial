package javapackage.polymorphism;

public class Overriding2 extends Overriding1 {
public static void main(String[] args) {
		
		
		Overriding1 r = new Overriding2();
		r.m2(1);
		

	}


	public void m2(int x) {
		
		System.out.println("child" +x);
		
	}

}
