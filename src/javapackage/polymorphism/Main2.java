package javapackage.polymorphism;

public class Main2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		int t = c.area(5);
		int g = r.area(3, 4);
		
		System.out.println(t);
		System.out.println(g);

	}

}
