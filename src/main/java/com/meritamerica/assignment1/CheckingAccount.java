package com.meritamerica.assignment1;

import static java.lang.Math.*;

public class CheckingAccount {
	
	private double balance;
	private final double INTEREST_RATE = 0.0001;
	
	/**
	 * @param openingBalance
	 */
	public CheckingAccount(double openingBalance) {
		//super();
		balance = openingBalance;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return INTEREST_RATE;
	}

	/**
	 * @return boolean: success or fail
	 */
	boolean withdraw(double amount) {
	
	}
	
	/**
	 * @return boolean: success or fail
	 */
	boolean deposit(double amount) {
		
	}
	
	double futureValue(int years) {
		return balance * pow(1 + INTEREST_RATE, years); 
	}

	@Override
	public String toString() {
		return "\nChecking Account Balance: $" + String.format("%.2f", this.getBalance())
		+ "\nChecking Account Interest Rate: " + String.format("%.4f", this.getInterestRate())
		+ "\nChecking Account Balance in 3 years: " + String.format("%.2f", this.futureValue(3));
	}
}	