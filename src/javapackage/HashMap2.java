package javapackage;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		String s = "PParaggaurav";
		char c[] = s.toCharArray();
		int d = 0;
		
		for(int i = 0; i<c.length;i++) {
			if(c[i]=='g') {
				
				d=d+1;
			}
				
			
			
		}
		
		System.out.println(d);
		
		
		int[] count = new int[128];
		for(int i=0; i< c.length;i++) {
			count[c[i]] = count[c[i]] + 1;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i] > 0) {
				System.out.println((char) i + " : " + count[i]);
			}
		}
		

	}

}
