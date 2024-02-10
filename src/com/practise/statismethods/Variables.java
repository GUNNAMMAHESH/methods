package com.practise.statismethods;

public class Variables {
	static int i;
	static double d;

	public static void localAndGlobal(int i, double d) {

		int val1= 45;
		int val2 = 34;
		System.out.println("local variables: " +val1+" "+val2);
		int intValue;double doubleValue;
		intValue = i;
		doubleValue = d;
		System.out.println("global variables: "+intValue+" "+doubleValue);
	}


	public static void main(String[] args) {
		// variables
		Variables.localAndGlobal(5, 34.9);

	}

}
