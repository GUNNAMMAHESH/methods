package com.practise.basics;

public class LogicalOperators {

	public static void main(String[] args) {

		int a = 12;
		int b = 45;
		int c = 89;
		int age = 65;
		boolean handicapter = true;

		if (a < b) {
			System.out.println(a);
			System.out.println("a is less than b");
		} else {
			System.out.println("a is greater than b");
		}

		if (a == 12 && b == 45 && c == 89) {
			System.out.println("a,b,c values are defined" + a + b + c);
		} else {
			System.out.println("a,b,c values are not defined");
		}
		if (a != 12 || b != a || c != b) {
			System.out.println(true);
		}
		if (age >= 60 || handicapter) {
			System.out.println(true);
		}

	}
}
