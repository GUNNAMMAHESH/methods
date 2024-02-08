package com.practise.methods;

public class BooleanMethods {
	public boolean logicalAnd(boolean val1,boolean val2) {
		boolean result = val1 && val2;
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		BooleanMethods and = new BooleanMethods();
		and.logicalAnd(true, false);
	}
}
