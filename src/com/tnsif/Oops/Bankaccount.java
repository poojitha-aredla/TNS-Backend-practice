package com.tnsif.Oops;

public class Bankaccount {
	private String accountHolder;
	private int balance;
	public String getaccountHolder() {
		return accountHolder;
	}
	public void setaccountHolder(String name) {
		if (name != null && !name.isEmpty()) {
            this.accountHolder = name;
        } else {
            System.out.println("Invalid name!");
        }
	}
	public double getBalance() {
        return balance;
    }
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

}
