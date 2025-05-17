package com.tnsif.abstraction;
abstract class Vehicle {
    
    public abstract void startEngine();
    
    
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key");
    }
}

class Tesla extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Tesla started with app");
    }
}



public class Abstract {
	public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myTesla = new Tesla();
        
        myCar.startEngine();    
        myTesla.startEngine();  
        myTesla.stopEngine();   
    }

}
