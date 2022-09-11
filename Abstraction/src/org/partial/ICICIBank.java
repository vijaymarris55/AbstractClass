package org.partial;

// Partial Class - Parent Class
public abstract class ICICIBank {
	// Non Abstract Methods
	public void personalLoanInterest(int rate) {
		System.out.println("Personal Loan Interst is :" + rate);
	}
	// Non Abstract Methods
	public void goldLoanInterest(int rate) {
		System.out.println("Gold Loan Interst is :" + rate);
	}

	// Abstract Methods
	public abstract void loanIntersetForEmployees(int rate);
	// Abstract Methods
	public abstract void salaryAccountEmployees(int rate);

}
