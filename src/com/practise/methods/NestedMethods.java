package com.practise.methods;

public class NestedMethods {
	public void two() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
	}

	public void three() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
	}
	public void both() {
		two();
		System.out.println();
		three();
	}

	public static void main(String[] args) {
		NestedMethods obj = new NestedMethods();
		obj.both();
	}

}
