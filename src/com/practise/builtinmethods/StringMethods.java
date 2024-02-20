package com.practise.builtinmethods;

import java.util.Arrays;

public class StringMethods {
	public static void operation() {
		String s = "Mahesh Gunnam";
		
		System.out.println("startsWith()");
		System.out.println(s.startsWith("Ma"));
		
		
		System.out.println("endsWith(String) method");
		System.out.println(s.endsWith("am"));
		System.out.println(s.endsWith("ma"));
		
		
		System.out.println("hashCode() method");
		System.out.println(s.hashCode());
		
	
		System.out.println("indexOf() method");
		System.out.println(s.indexOf("G"));
		System.out.println(s.indexOf("a",4));
		
	
		System.out.println("lastIndexOf()");
		System.out.println(s.lastIndexOf("e"));
		

		System.out.println("substring()");
		System.out.println(s.substring(7));
		System.out.println(s.substring(0,6));//(start,count)
		
		
		System.out.println("subSequence()");
		System.out.println(s.subSequence(0, 3));
		
		
		System.out.println("concat()");
		System.out.println(s.concat(" Chowdary"));
		
		
		System.out.println("replace()");
		System.out.println(s.replace("Gunnam", "Chowdary"));
		System.out.println(s);
		
	
		System.out.println("contains()");
		System.out.println(s.contains("G"));
		

		String sk = "c-ale-nd-ar";
		System.out.println("split()");
		System.out.println(Arrays.toString(sk.split("-", 3)));
		System.out.println(Arrays.toString(sk.split("-")));
		

		System.out.println("join()");
		System.out.println(String.join("->",s,sk));
		

		System.out.println("toLowerCase()");
		System.out.println(s.toLowerCase());
		
		
		System.out.println("toUpperCase()");
		System.out.println(s.toUpperCase());
		
		
		String k = " sad ";
		System.out.println("trim()");
		System.out.println(k);
		System.out.println(k.trim());
		
		
		String o = "";
		System.out.println("isBlank()");
		System.out.println(o.isBlank());
		
		
		System.out.println("toString()");
		System.out.println(s.toString());
		
		
	}
	
	public static void main(String[] args) {
		StringMethods.operation();
	}

}