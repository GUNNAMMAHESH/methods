package com.practise.methods;

public class Palidrom {
	

	public int m1() {
		int a = 0;
		int b = 1;
		int c;
		int sum = 0;
		System.out.println(a);
		for (int i = 0; i < 10; i++) {
			sum = a + b;
			b= a;
			a= sum;
			
			System.out.println(sum);
		}
		return sum;

	}

	public static void main(String[] args) {
		Palidrom p = new Palidrom();
		System.out.println(p.m1());
	}
}
