package com.practise.icici;

import com.practise.oops.Rbi;

public class Icici extends Rbi {

	public void educationLoan() {
		Icici iciciobj = new Icici();
		iciciobj.educationLoan();
	}

	@Override
	public void homeLoan() {
		System.out.println("homeLoan :" + 8 + "%");
	}

	public void personalLoan() {
		Icici iciciobj = new Icici();
		iciciobj.personalLoan();
	}

	@Override
	public void goldLoan() {
		System.out.println("goldLoan :" + 4 + "%");
	}

	public static void main(String[] args) {
		Icici iciciobj = new Icici();
		iciciobj.personalLoan();

	}
}
