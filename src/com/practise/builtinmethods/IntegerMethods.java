
package com.practise.builtinmethods;

public class IntegerMethods {
	public static void IntegerOperations() {
		String s = "123";

		// parseInt()
		System.out.println("parseInt()");
		System.out.println("Hexa Deciamal: " + Integer.parseInt(s, 16));
		System.out.println("Octal: " + Integer.parseInt(s, 8));
		System.out.println("Decimal: " + Integer.parseInt(s));
		String name = "mahesh123";
		System.out.println(Integer.parseInt(name, 6, 8, 10));

		// valueOf()
		System.out.println("valueOf()");
		System.out.println(Integer.valueOf(s));
		System.out.println(Integer.valueOf(2));

		Integer i = new Integer(s);
		System.out.println(i.longValue());
		System.out.println(s + " is of type " + ((Object) s).getClass().getSimpleName());

		// toString()
		System.out.println("toString()");
		System.out.println(Integer.toString(10));

		System.out.println(i.hashCode());

		// equals()
		System.out.println("equals()");
		System.out.println(i.equals(123));

		String system = "sun.arch.data.model";
		System.out.println(Integer.getInteger(system));

	}

	public static void main(String[] args) {
		IntegerMethods.IntegerOperations();
	}

}
