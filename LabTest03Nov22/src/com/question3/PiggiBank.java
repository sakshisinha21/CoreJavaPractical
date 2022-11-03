package com.question3;

public class PiggiBank {
	
	// instance variables
	private double balance=50;
	
	// method to enter amount
	void AddAmount(double bal) {
		balance = bal;
	}
	
	// method to add more money
	double addMoney(double amount) {
		balance += amount;
		
		System.out.println("The Total Balance In Your Piggi Bank Is .......");
		return balance;
	}
	
	//print amount of piggi bank
	void piggiBankAmount() {
		System.out.println("Balance :" + balance);
	}
	
	
}