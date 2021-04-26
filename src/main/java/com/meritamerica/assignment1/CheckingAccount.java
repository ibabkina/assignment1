package com.meritamerica.assignment1;

/**
 * This program creates a checking account for a bank's client by setting a balance.
 * It allows to deposit funds, withdraw funds and calculate FV. It allows to get 
 * the balance and interest rate of the account.
 * 
 * @author Irina Babkina 
 */

import static java.lang.Math.*;

public class CheckingAccount {
	
	private double balance;
	private final double INTEREST_RATE = 0.0001;
	
	/**
	 * @param openingBalance
	 */
	public CheckingAccount(double openingBalance) {
		//super();
		this.balance = openingBalance;
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
	 * @param amount
	 * @return boolean: success or fail
	 */
	boolean withdraw(double amount) {
		if (amount < 0.0 || amount > balance) {
			return false;
		}
		balance -= amount;
		return true;	
	}
	
	/**
	 * @param amount
	 * @return boolean: success or fail
	 */
	boolean deposit(double amount) {
		if (amount < 0.0) {
			return false;
		}
		balance += amount;
		return true;	
	}
	
	/**
	 * Calculates the future value of the account balance based on the interest 
	 * and number of years
	 * @param years: number of periods in years
	 * @return the future value
	 */
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