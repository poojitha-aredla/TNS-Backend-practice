package com.tnsif.Oops;

public class Encapsulation {
	public static void main(String []args) {
        Bankaccount account = new Bankaccount();
        
        account.setaccountHolder("Alice"); // Valid
        account.setaccountHolder("");     // Invalid (error message)
        
        account.deposit(1000);  // Valid
        account.deposit(-500);   // Invalid (error message)
        
        System.out.println("Holder: " + account.getaccountHolder());
        System.out.println("Balance: $" + account.getBalance());
	}

}
