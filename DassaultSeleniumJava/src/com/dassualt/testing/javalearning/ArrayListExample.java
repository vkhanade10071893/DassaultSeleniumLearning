package com.dassualt.testing.javalearning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<String>();
		
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("Laxam");
		a1.add("Ravan");
		a1.add("Sita");
		a1.add("Rahul");
		System.out.println(a1);
		
		List<String> a2 = new ArrayList<String>();
		//a2=a1 to copy
		for(int i=0; i<a1.size(); i++) {
			
			if (remainder(i,2) !=0) {
				
				a2.add(a1,get(i));			
			} 
		}
		
		System.out.println(a2);
		
	}

	private static int remainder(int i, int j) {

		
		return Integer.remainder(a1+(i), j);
	}

}
