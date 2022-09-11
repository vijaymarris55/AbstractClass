package org.partial;

// Partical Class - Child Class
// Official Use
public class ICICIEmployee extends ICICIBank {

	@Override
	public void loanIntersetForEmployees(int rate) {
		System.out.println("For Employees Interest is :" + " " + rate);
	}

	@Override
	public void salaryAccountEmployees(int rate) {
		System.out.println("Salary Account is :" + " " + rate);
	}

	public static void main(String[] args) {
		ICICIEmployee e = new ICICIEmployee();
		e.personalLoanInterest(5);
		e.goldLoanInterest(12);
		e.loanIntersetForEmployees(4);
		e.salaryAccountEmployees(123456);
	}

}
