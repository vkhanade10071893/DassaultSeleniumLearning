package com.dassualt.testing.javalearning;
public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstname = "Vikramsingh";
		String lastname = "Khanade";
		
		int lenghtoffirstname;
		lenghtoffirstname = firstname.length();
		
		int lenghtoflastname = lastname.length();
		
		System.out.println(lenghtoffirstname);
		System.out.println(lenghtoflastname);
		
		System.out.println("Lenght of first Name is : "+firstname.length());
		
		System.out.println("Full name is:"+(firstname.length()+lastname.length()));
		
		
		System.out.println("Full name is:"+firstname+ " "+lastname);
		System.out.println("Full name using concat is: "+firstname.concat(" ").concat(lastname));
		
		System.out.println("Full name in CAPs is:"+firstname.toUpperCase()+ " "+lastname.toUpperCase());
		System.out.println("Lenght of full name is: "+firstname.length()+lastname.length()); // since bracket is not added sum not done
		
		System.out.println("Lenght of full name is: "+(firstname.length()+lastname.length()));
		
	}

}
