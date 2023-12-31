	package javapackage;
	
	import java.util.ArrayList;
	import java.util.Iterator;
	
	public class ArrayList1 {
	
		public static void main(String[] args) {
	
			// Create a array list
	
			ArrayList<Object> obj = new ArrayList<Object>();
	
			// Adding object in ArrayList
	
			obj.add(1);
			obj.add("Selenium");
			obj.add(7.0);
			obj.add('a');
			obj.add(3 > 12);
	
			// Printing Array list element -- 1st way
			System.out.println(obj);
	
			// Printing Array list element -- 2nd way
	
			Iterator abc = obj.iterator();
	
			while (abc.hasNext()) {
				System.out.println("Using Iterator and while loop : " + abc.next());
			}
	
			// Printing Array list element -- 3rd way
	
			for (Object bcd : obj) {
				System.out.println("Using for loop : " + bcd);
			}
	
		}
	
	}
