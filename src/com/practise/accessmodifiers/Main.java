package com.practise.accessmodifiers;

public class Main {
//	public
//	private
//	protected
//	default
	
	protected static int score = 100;
	
	public static void publicMethod() {
		System.out.println("public method");
	}

	public static void main(String[] args) {
        int[] factors = PrimeNumber.pNumbers(50);
        System.out.println(factors);
        
        
        int val = SquareRoot.sRoots(9);
        System.out.println(val);
        
	}

}
