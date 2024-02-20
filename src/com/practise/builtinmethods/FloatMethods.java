package com.practise.builtinmethods;

public class FloatMethods {
	public static void main(String[] args) {
//		float to string
		System.out.println(Float.toString(34.6f));

//		float to float object
		System.out.println(Float.valueOf(23.98f));

//		string to float (primitive float value)
		System.out.println(Float.valueOf("45.0f"));

//		byteValue()
		@SuppressWarnings("removal")
		Float floatValue = new Float(10.5f);

//		byte value to Float object
		byte byteVal = floatValue.byteValue();
		System.out.println("Byte value of the Float object: " + byteVal);

//		hashCode()
		System.out.println(Float.hashCode(56.99f));

//		true if float is nan
		System.out.println(Float.isNaN(Float.NaN));

//		isInfinite()
		System.out.println(Float.isInfinite(10.5f));

		System.out.println(Float.isInfinite(Float.POSITIVE_INFINITY));

//		equals()
		System.out.println(Float.valueOf(67.1f).equals(Float.valueOf(32.6f)));

		System.out.println(Float.valueOf(0.0f).equals(Float.valueOf(0.0f)));

//		 compare()In this example, Float.compare(num1, num2) compares the values of num1 and num2. The result will be negative if num1 is less than num2, positive if num1 is greater than num2, and zero if they are equal.

		System.out.println( Float.compare(36f,5f));

	}

}
