package com.practise.basics;

import com.practise.accessmodifiers.Main;

public class CondictionStatements {

	public static void main(String[] args) {
		// <= , nested if, && , || , else-if

		int a = 76;
		int b = 47;
		int c = 72;
		if (a <= 90) {
			System.out.println("a is less than or equal to b");
		}

		if (a >= b) {
			System.out.println("a is greater than b");
			if (a >= c) {
				System.out.println("a is greater than b and c");
			} else {
				System.out.println("a is less than b and c");
			}
		} else {
			System.out.println("a is less than b");
		}

		
		//same solution with logical operators
		
		if (a >= b && a <= c) {
			System.out.println("a is greater than b and less than c");
		} else if(b >= a && b<=c) {
			System.out.println("b is greater than a and less than c");
		}else {
			if(c>a)
			System.out.println("c is greater than a and b");
		}

	}
}
