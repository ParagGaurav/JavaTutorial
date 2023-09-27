package javapackage.polymorphism;

public class Rectangle extends Shape {
	
	int area(int x, int y) {
		return x*y;
	}
	
	int area(int x) {
		return 0;
	}
	


}
