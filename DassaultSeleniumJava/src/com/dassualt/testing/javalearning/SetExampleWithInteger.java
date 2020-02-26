package com.dassualt.testing.javalearning;

import java.util.HashSet;
import java.util.Set;

public class SetExampleWithInteger {

	public static void main(String[] args) {

		Set<Integer>myInt = new HashSet<Integer>();
		
		myInt.add(0);
		myInt.add(1);
		myInt.add(2);
		myInt.add(3);
		myInt.add(4);
		myInt.add(5);
		myInt.add(6);
		myInt.add(7);
		myInt.add(8);
		myInt.add(9);
		
		for (Integer i : myInt) {
			System.out.println(i);
			
		}
		
	}

}
