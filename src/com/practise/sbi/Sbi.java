package com.practise.sbi;

import com.practise.oops.Rbi;

public class Sbi extends Rbi {


	public void educationLoan() {
//		Sbi sbiobj = new Sbi();
//		sbiobj.educationLoan();
		super.educationLoan();
		System.out.println("Sbi homeLoan :" + 4+ "%");
	}

	@Override
	public void homeLoan() {
		super.homeLoan();
		System.out.println("Sbi homeLoan :" + 8 + "%");
	}

	public void personalLoan() {
		Sbi sbiobj = new Sbi();
		sbiobj.personalLoan();
	}

	@Override
	public void goldLoan() {
		super.goldLoan();
		System.out.println("Sbi goldLoan :" + 4 + "%");
	}

	public static void main(String[] args) {
		Sbi sbiobj = new Sbi();
		sbiobj.educationLoan();
		sbiobj.homeLoan();
		sbiobj.personalLoan();
		sbiobj.goldLoan();
		
	}
}
