package com.dassualt.testing.javalearning;

public class Car implements Vehicle{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "car";
	}

	@Override
	public void start() {
		//int i;
		System.out.println(("car is starting"));
		
	}

	@Override
	public void stop() {


	System.out.println("car is stoping");
		
	}

}
