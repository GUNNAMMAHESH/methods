package com.practise.methods;

public class NestedInputes {
	int i;
	String str;
	boolean b;

	NestedInputes(int i, String string, boolean b) {
		// TODO Auto-generated constructor stub
		i = i;
		str = str;
		b = b;
		System.out.println(str);

	}

	public static void first(int i, String str, boolean b) {
		String name;
		int age;
		if (b) {
			name = str;
			age = i;
			System.out.println(i);
			
		}

	}

	public static void main(String[] args) {
		NestedInputes.first(10, "mahesh", true);

	}
}
