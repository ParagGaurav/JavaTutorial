package javapackage;

public class Static3 {
	int roll; // declaring global variable 
	String name; // declaring global variable 
	static String college = "IIT Bombay"; // declaring global variable
	
	// constructor 
	Static3(int r , String n){
		
		roll = r;
		name = n;
		
		
	}
	
	public void getResult() {
		
		System.out.println(roll + " " + name + " "+ college);
	}
	
	
	

}
