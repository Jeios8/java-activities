package chapter5;

// Abstract class with an abstract method and a concrete method
abstract class abstractClass {
    abstract void abstractMethod();  // Abstract method to be implemented by subclasses
    
    void concreteMethod() {  // Concrete method with a default implementation
        System.out.println("This is a concrete method.");
    }
}

// Subclass B providing its implementation of abstractMethod
class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

// Subclass C providing its own implementation of abstractMethod
class C extends abstractClass {
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Tasksheet126 {
    public static void main(String args[]) {
        // Creating an instance of subclass B and calling its methods
        B b = new B();
        b.abstractMethod();  // Calls B's implementation
        b.concreteMethod();  // Calls the concrete method from abstractClass

        // Creating an instance of subclass C and calling its methods
        C c = new C();
        c.abstractMethod();  // Calls C's implementation
        c.concreteMethod();  // Calls the concrete method from abstractClass
    }
}
