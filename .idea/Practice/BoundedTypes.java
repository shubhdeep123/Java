package Practice;

public class BoundedTypes {
    public static void main(String[] args) {
        UpperBoundBox<Integer> box1 = new UpperBoundBox<>(10);
        box1.printDouble();

        AnimalBox<Fish> fish = new AnimalBox<>();
        // these cannot be used as the bounded type needs object that extends an++Animal and implements Swimmable
        // AnimalBox<Animal> animal = new AnimalBox<>();
        // AnimalBox<Dog> dog = new AnimalBox<>();
    }
}

// Generics -> T can be anything

// Bounds in Generics

// upper bound -> T is atleast Number or its subtype
class UpperBoundBox<T extends Number> {
    T value;

    UpperBoundBox(T value) {
        this.value = value;
    }

    public void printDouble() {
        System.out.println(value.doubleValue());
    }

}


// example for generic class that extends and implements
class Animal {
    void display() {
        System.out.println("this is animal");
    }
}

interface Swimmable {
    void swim();
}

class Dog extends Animal {

}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish Swims");
    }
}

class AnimalBox<T extends Animal & Swimmable> {

}