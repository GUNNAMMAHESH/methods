package com.practise.statismethods;

public class Variables {
	static int i = 20;
	static double d= 50;

	public static void localAndGlobal(int i, double d) {
		// local variables
		int val1= 45;
		int val2 = 34;
		System.out.println("local variables: " +val1+" "+val2);
		
		//global variables
		System.out.println("global variables: "+i+" "+d);
		
	}


	public static void main(String[] args) {

		Variables.localAndGlobal(i,d);
		

	}
}
