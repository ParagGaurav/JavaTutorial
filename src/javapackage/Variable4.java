

package javapackage;

public class Variable4 {
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6,7,8,9,10}; // Integer type array
		
		String b[] = {"John", "peter"}; // String type array
		
		System.out.println(b[0]); // John
		System.out.println(a[3]); // 4
		System.out.println(a[0]); // 1
		System.out.println(a[6]); // 7
		System.out.println(a[1]); // 2
		System.out.println(a[2]); // 3
		System.out.println(a[4]); // 5
		System.out.println(a[5]); // 6
		System.out.println(b[1]); // peter
		
		Object c[] = {1,2,3,"john","peter",'a','b',3>12}; // Object array
		
		System.out.println(c[3]);
		System.out.println(c[0]);
		System.out.println(c[5]);
		System.out.println(c[6]);
		System.out.println(c[7]);
		System.out.println(c[8]); // java.lang.ArrayIndexOutOfBoundsException
		
	}

}
