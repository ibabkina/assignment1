package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn; //Social Security Number
	private CheckingAccount chkAccount;
	private SavingsAccount savAccount;

	public AccountHolder() {}
	
/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param ssn
	 * @param chAcc
	 * @param savAcc
	 */
	public AccountHolder(String firstName, String middleName, String lastName,
							String ssn, double checkingAccountOpeningBalance,
							double savingsAccountOpeningBalance) {
		//super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.chkAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savAccount = new SavingsAccount(savingsAccountOpeningBalance);
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
	 * @return the chAcc
	 */
	public CheckingAccount getCheckingAccount() {
		return chkAccount;
	}

	/**
	 * @return the savAcc
	 */
	public SavingsAccount getSavingsAccount() {
		return savAccount;
	}

	@Override
	public String toString() {
		return "\nName: " +  this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName()
				+ "\nSSN: " + this.getSSN() 
				+ this.getCheckingAccount().toString()
				+ this.getSavingsAccount().toString();
	}	
}