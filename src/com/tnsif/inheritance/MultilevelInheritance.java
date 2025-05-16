package com.tnsif.inheritance;
class Grandparent {
    void grandparentMethod() {
        System.out.println("This is the Grandparent class.");
    }
}

class Father extends Grandparent {
    void parentMethod() {
        System.out.println("This is the Parent class.");
    }
}

class Son extends Father {
    void childMethod() {
        System.out.println("This is the Child class.");
    }
}
public class MultilevelInheritance {
	public static void main(String[] args) {
        Son obj = new Son();
        obj.grandparentMethod(); 
        obj.parentMethod();       
        obj.childMethod();        
    }

}
