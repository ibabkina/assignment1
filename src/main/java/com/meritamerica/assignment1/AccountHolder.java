package com.meritamerica.assignment1;

/**
 * This program creates an account holder and instantiates their checking 
 * and savings accounts. it allows to get information about an account holder and 
 * their accounts.
 * 
 * @author Irina Babkina 
 */

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn; //Social Security Number
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

	public AccountHolder() {}
	
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param ssn
	 * @param checkingAccountOpeningBalance
	 * @param savingsAccountOpeningBalance
	 */
	public AccountHolder(String firstName, 
							String middleName, 
							String lastName,
							String ssn, 
							double checkingAccountOpeningBalance,
							double savingsAccountOpeningBalance) {
		//super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the ssn
	 */
	public String getSSN() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the CheckingAccount
	 */
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	/**
	 * @return the SavingsAccount
	 */
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	@Override
	public String toString() {
		return "\n\nName: " +  this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName()
				+ "\nSSN: " + this.getSSN() 
				+ this.getCheckingAccount().toString()
				+ this.getSavingsAccount().toString();
	}	
}