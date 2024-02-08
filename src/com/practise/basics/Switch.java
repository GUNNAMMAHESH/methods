package com.practise.basics;

public class Switch {

	public static void main(String[] args) {
		String day = "wednesday";
		switch (day) {
		case "sunday":
			System.out.println("sunday");
			break;
		case "monday":
			System.out.println("monday");
			break;
		case "tuesday":
			System.out.println("tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		case "thrusday":
			System.out.println("thrusday");
			break;
		case "friday":
			System.out.println("friday");
			break;
		case "saturday":
			System.out.println("saturday");
			break;

		}
		
		int num1 = 48;
		int num2 = 23;
		String operator = "+";
		switch (operator) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		case "%":
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("invalid operation");
		}

	}

}
