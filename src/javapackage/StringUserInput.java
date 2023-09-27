package javapackage;
import java.util.Scanner;

public class StringUserInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String x = sc.nextLine();
		System.out.println("Your name is " + x);
		
	}
	

}
