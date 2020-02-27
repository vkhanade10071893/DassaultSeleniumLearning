package com.dassualt.testing.javalearning;

public class Bike implements Vehicle{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Bike";
	}

	@Override
	public void start() {
		//int i;
		System.out.println(("Bike is starting"));
		
	}

	@Override
	public void stop() {


	System.out.println("Bike is stoping");
		
	}

}
