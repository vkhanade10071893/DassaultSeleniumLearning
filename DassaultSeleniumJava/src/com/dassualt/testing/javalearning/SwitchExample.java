package com.dassualt.testing.javalearning;

public class SwitchExample {

	public static void main(String[] args) {		
		int month = 8;		
System.out.println(getMonthString(month));
printMonthString(9);
	}
	private static String getMonthString(int month) {
		
		switch(month) {
		case 1: return "Jan";
		case 2: return "Feb";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "Aug";
		case 9: return "Sept";
		case 10: return "Oct";
		case 11:return "Nov";
		case 12: return "Dec";
		default: return "not found";
		}
		
	}

private static void printMonthString(int month) {
	String monthstring = null;
	
	switch (month) {
	case 1: monthstring = "Jan";
	break;
	case 2: monthstring = "Feb";
	break;
	case 3: monthstring = "March";
	break;
	case 4: monthstring = "April";
	break;
	case 5: monthstring = "May";
	break;
	case 6: monthstring = "June";
	break;
	case 7: monthstring = "July";
	break;
	case 8: monthstring = "Aug";
	break;
	case 9: monthstring = "Sept";
	break;
	case 10: monthstring = "Oct";
	break;
	case 11:monthstring = "Nov";
	break;
	case 12: monthstring = "Dec";
	break;
		
	}
	//monthstring = "Not Found";
	System.out.println(monthstring);
}
}