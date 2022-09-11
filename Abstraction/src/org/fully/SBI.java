package org.fully;

// Fully Abstraction - Child Class
public class SBI implements RBI {

	@Override
	public void amountToSBI() {
		System.out.println("Amount to SBI is One Billion");
		interestRateToSBI();
	}

	@Override
	public void interestRateToSBI() {
		System.out.println("Interset Rate to SBI is 7%");

	}

	public static void main(String[] args) {
		SBI s = new SBI();
		s.amountToSBI();
	}

}
