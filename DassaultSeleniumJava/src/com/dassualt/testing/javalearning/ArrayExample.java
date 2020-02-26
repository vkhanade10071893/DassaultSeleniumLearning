package com.dassualt.testing.javalearning;

public class ArrayExample {


	public static void main(String[] args) {

		int[] myArr = {10, 23, 34,5};
		
		int myNum;
		myNum = getBiggerNumber(myArr);
		
		System.out.println("Largest number is: "+myNum);
	}

	private static int getBiggerNumber(int[] myArr) {

		int biggernumber = 0;
		
		for(int i=0; i<4; i++) {
			if (myArr[i] > biggernumber) {
				biggernumber = myArr [i];
			}
		}
		
		return biggernumber;
	}

}
