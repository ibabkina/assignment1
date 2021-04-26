package com.meritamerica.assignment1;

/**
 * This program runs the bank application, sets account holders and their accounts,
 * and provides information about account holders and their checking and savings accounts.
 * 
 * @author Irina Babkina 
 */

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		
		AccountHolder accHolder = new AccountHolder("John", "James", "Doe", "123-45-6789", 100, 1000);
		System.out.println(accHolder);	
		
		//System.out.print(accHolder.getCheckingAccount().toString());	
		//System.out.print(accHolder.getSavingsAccount().toString());
		
		accHolder.getCheckingAccount().deposit(500.00);
		accHolder.getSavingsAccount().withdraw(800.00);	
		System.out.print(accHolder.getCheckingAccount().toString());		
		System.out.print(accHolder.getSavingsAccount().toString());
		
		AccountHolder accHolder2 = new AccountHolder("Sarah", "Dona", "Brown", "477-32-1998", 200, 500); 
		accHolder2.getCheckingAccount().deposit(-500.00);
		accHolder2.getSavingsAccount().withdraw(600.00);
		System.out.println(accHolder2);	
		System.out.println(accHolder2.getCheckingAccount().toString());		
		System.out.println(accHolder2.getSavingsAccount().toString());	
	}	
}