package com.practise.oops;

public class MethodOverloading {
	public int function(int a, int b) {
		System.out.println(a + b);
		return (a + b);
	}

	public int function(int a, int b, int c) {
		System.out.println(a + b + c);
		return (a + b + c);
	}

	public String function(String str1, String str2) {
		System.out.println(str1 + str2);
		return (str1 + str2);
	}
	public String function(String str1,int i) {
		System.out.println(str1+String.valueOf(i));
		return(str1+i);
	}

	public float function(float a, int b) {
		System.out.println(a + b);
		return (a + b);
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.function(5, 6);
		mo.function("Hii", "Hello");
		mo.function("Ready SET Go :", 321);
	}
}
