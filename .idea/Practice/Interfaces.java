package Practice;

public class Interfaces {
    public static void main(String[] args) {
        // Payable creditCard = new CreditCard();
        // creditCard.pay();

        // Payable debitCard = new DebitCard();
        // debitCard.pay();

        // Vehicle car = new Car();
        // car.start();
        // car.stop();

        // int sum = MathUtils.add(5, 10);
        // System.out.println("Sum: " + sum);

        // StreetDog streetDog = new StreetDog();
        // streetDog.roam();
        // streetDog.eat();
        // streetDog.bark();

        MyClass myClass = new MyClass();
        myClass.display(); // Output: MyClass display

    }
}

// polymorphism is a concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. 
// In this example, the Payable interface defines a common method pay() that is implemented by both CreditCard and DebitCard classes. 
// This allows us to use polymorphism to call the pay() method on different types of payment methods without knowing their specific implementations.
interface Payable {
    void pay();
}

class CreditCard implements Payable {
    @Override
    public void pay() {
        System.out.println("Paying with credit card");
    }
}

class DebitCard implements Payable {
    @Override
    public void pay() {
        System.out.println("Paying with debit card");
    }
}

// variable inside interface is by default public, static and final. 
// It means that the variable is a constant and cannot be changed.

interface Constants {
    double PI_VALUE = 3.14; // public static final by default
}

// multiple inheritance is a feature in object-oriented programming that allows a class to inherit from more than one superclass.
// In Java, multiple inheritance is not supported through classes, but it can be achieved through interfaces

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }
}

// interface inheritance is a feature in object-oriented programming that allows an interface to inherit from another interface.
interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

class StreetDog implements Dog, Logger {
    void roam() {
        System.out.println("Street dog is roaming");
    }

    @Override
    public void eat() {
        info("Street dog is eating");
        System.out.println("Street dog is eating");
    }

    @Override
    public void bark() {
        error("Street dog is barking");
        System.out.println("Street dog is barking");
    }
}

// default methods in interfaces are a feature introduced in Java 8 that allows interfaces to have method implementations.
interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// static methods in interfaces are a feature introduced in Java 8 that allows interfaces to have static methods.
interface MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}

// private methods in interfaces are a feature introduced in Java 9 that allows interfaces to have private methods.
interface Logger {
    private void log(String message) {
        System.out.println("Log: " + message);
    }

    default void info(String message) {
        log("INFO: " + message);
    }

    default void error(String message) {
        log("ERROR: " + message);
    }
}

// java priority of interface methods is a feature in Java that determines which method implementation to use when a 
// class implements multiple interfaces with the same method signature.
// and when a class extends a superclass and implements an interface with the same method signature.
interface Interface1 {
    default void display() {
        System.out.println("Interface1 display");
    }
}


class Class12 {
    public void display() {
        System.out.println("Class12 display");
    }
}

class MyClass extends Class12 implements Interface1 {

}

