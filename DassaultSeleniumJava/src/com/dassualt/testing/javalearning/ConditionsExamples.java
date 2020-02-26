package com.dassualt.testing.javalearning;

public class ConditionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "First";
		String s2 = "Second";
		
		String biggersrtring = getBiggerString(s1,s2);
		System.out.println("The bigger string is "+ biggersrtring);
		
		}

	private static String getBiggerString(String s1, String s2) {


		if (s1.length()>s2.length()) {
			return s1;
				
		} else if (s1.length()==s2.length()) {
			return "s1 is equal to s2";
		}
		else {
			return s2;
		}
		
		
	}

}


