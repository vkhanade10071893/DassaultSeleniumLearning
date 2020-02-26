package com.dassualt.testing.javalearning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<String>();
		mySet.add("S");
		mySet.add("E");
		mySet.add("L");
		mySet.add("E");
		mySet.add("N");
		mySet.add("I");
		mySet.add("U");
		mySet.add("M");
		
//		Iterator<String>iter =mySet.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		
//			System.out.println(mySet.size());
		
		for (String s : mySet) {
			
			System.out.println(s);
		}
	}

}
