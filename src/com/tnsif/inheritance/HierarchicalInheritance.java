package com.tnsif.inheritance;
class Owner {
    void parentMethod() {
        System.out.println("This is the Parent class.");
    }
}

class Child1 extends Owner {
    void child1Method() {
        System.out.println("This is Child1 class.");
    }
}

class Child2 extends Owner {
    void child2Method() {
        System.out.println("This is Child2 class.");
    }
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.parentMethod();   
        obj1.child1Method();   

        Child2 obj2 = new Child2();
        obj2.parentMethod();   
        obj2.child2Method();   
    }

}
