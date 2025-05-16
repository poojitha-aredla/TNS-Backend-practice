package com.tnsif.inheritance;
interface A {
    void methodA();
}

class B implements A {
    public void methodA() {
        System.out.println("Method A from interface A in class B");
    }
    void methodB() {
        System.out.println("Method B from class B");
    }
}

class C implements A {
    public void methodA() {
        System.out.println("Method A from interface A in class C");
    }
    void methodC() {
        System.out.println("Method C from class C");
    }
}
class D extends B {
    void methodD() {
        System.out.println("Method D from class D");
    }
}

public class Hybridinheritance {
	public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); 
        obj.methodB(); 
        obj.methodD(); 
    }
	

}
