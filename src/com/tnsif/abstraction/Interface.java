package com.tnsif.abstraction;
interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Credit Card");
    }
}

class PayPal implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal");
    }
}

public class Interface {
	public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        Payment payment2 = new PayPal();
        
        payment1.pay(100.0);  
        payment2.pay(50.0);    
    }

}
