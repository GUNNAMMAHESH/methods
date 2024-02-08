package com.practise.basics;

public class ForEach {
	public static void main(String[] args) {
		boolean[] b = { false, true, false, true, true, false };
		for (boolean c : b) {
//		System.out.println(c);
			if (c) {
				System.out.println(c);
			} else {
				c = true;
				System.out.println(c);

			}
		}
		
		String[] colors = {"red","Blue",null,"Green","orange"};
		for (String ref : colors) {
			if(ref instanceof String){
				System.out.println("I am string :"+ref);
			}
		}
	}
}
