package javapackage.polymorphism;

public class CountArray {

	public static void main(String[] args) {
		String s = "paraggaurav";
		char c[]= s.toCharArray();
		int[]count = new int [128];
		
		for (int i =0;i<c.length; i++) {
			
			count[c[i]]= count[c[i]]+1;
			
			
		}
		for (int i=0; i<count.length;i++) {
		if (count[i]>0){
			System.out.println((char)i+ " :"+ count[i]);
		}

	}
	}
}
