package javapackage.polymorphism;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcddeef";
		
		//1st way
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		System.out.println(set);
		
		//2nd way
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
			
			}
		}

	}

}
