package com.meritamerica.assignment1;

import static java.lang.Math.pow;

public class SavingsAccount {
	
	private double balance;
	private final double INTEREST_RATE = 0.01;
	
	
	/**
	 * @param openingBalance
	 */
	public SavingsAccount(double openingBalance) {
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

	boolean withdraw(double amount) {
		
	}
	
	boolean deposit(double amount) {
		
	}
	
	double futureValue(int years) {
		return balance * pow(1 + INTEREST_RATE, years); 
	}
	
	@Override
	public String toString() {
		return "\nSavings Account Balance: $" + String.format("%.2f", this.getBalance())
		+ "\nSavings Account Interest Rate: " + String.format("%.2f", this.getInterestRate())
		+ "\nSavings Account Balance in 3 years: " + String.format("%.2f", this.futureValue(3));
	}
}