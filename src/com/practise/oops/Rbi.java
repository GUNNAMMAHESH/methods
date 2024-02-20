package com.practise.oops;

public class Rbi {
	int e=2, h=5, p=7, g=3;

	protected void educationLoan() {
		System.out.println("Rbi eucationLoan :" + e + "%");
	}

	protected void homeLoan() {
		System.out.println("Rbi homeLoan :" + h + "%");
	}

	protected void personalLoan() {
		System.out.println("Rbi personalLoan :" + p + "%");
	}

	protected void goldLoan() {
		System.out.println("Rbi goldLoan :" + g + "%");
	}
	protected static void commonLoan() {
		System.out.println("Rbi goldLoan :" +6  + "%");
	}

	public static void main(String[] args) {
		Rbi rbiObj = new Rbi();
		rbiObj.educationLoan();
		rbiObj.homeLoan();
		rbiObj.personalLoan();
		rbiObj.goldLoan();

	}

}
