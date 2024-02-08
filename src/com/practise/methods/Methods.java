package com.practise.methods;

public class Methods {
	char c1 = 'm';
	char c2 = 'g';

	public String adding() {
		String word = String.valueOf(c1) + String.valueOf(c2);
		return word;
	}

	public static void main(String[] args) {
		Methods s = new Methods();
		s.adding();
		System.out.println(s.adding());
	}
	
	
	

}
