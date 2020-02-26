package com.dassualt.testing.javalearning;

public class Human {
	
	// Properties of the class
	String name;
	char sex;
	int age;
	static int count = 0;
	
	public Human(){
		count++;
		name = "Default";
	}
	
	public Human(String n) {
		count++;
		name = n;
	}
	
	//Behaviours of the class
	
	private void walk() {
		
		System.out.println(name +" is walking");
		}
	public void talk() {
		System.out.println(name +" is talking");
	}
	
	public static void main(String[] args) {
		Human h1 = new Human();
		//count++;
		h1.name = "Vikram";
		h1.sex = 'M';
		h1.age = 36;
	
		Human h2 = new Human();
		//count++;
		h2.name = "Shalu";
		h2.sex = 'M';
		h2.age = 38;
		
		Human h3 = new Human();
		// count++;
		System.out.println("Total human so far "+ count);
		
		Human h4 = new Human();
		//count++;
		Human h5 = new Human();
		//count++;
		System.out.println("Total human so far "+ count);
		
		Human h6 = new Human("Mark");
		
		
		h1.walk();
		h2.talk();
		h3.walk();
		h6.talk();
}
}


