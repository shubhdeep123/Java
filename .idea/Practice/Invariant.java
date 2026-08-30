package Practice;

import java.util.ArrayList;
import java.util.List;

public class Invariant {
    public static void main(String[] args) {
        // Invariant in generics
        // AnimalClass animal = new DogClass();
        // animal.eat();
        // animal.walk();

        // List<DogClass> dogs = new ArrayList<>();
        // List<AnimalClass> animals = dogs; // not possible in java
        
        DogClass[] dogs = new DogClass[10];
        AnimalClass[] animals = dogs;

        // animals[0] = new AnimalClass();
        animals[0] = new DogClass();
        animals[1] = new DogClass();
        animals[2] = new DogClass();
        animals[3] = new DogClass();
        // animals[4] = new AnimalClass(); // run-time error (co-variant)

        for (AnimalClass animal : animals) {
            if (animal == null) continue;
            animal.eat();
        }

        // for (DogClass dog : dogs) {
        //     dog.bark();
        // }

    }
}

class AnimalClass {
    void eat() {
        System.out.println("Animal is eating");
    }

    void walk() {
        System.out.println("Animal is walking");
    }
}

class DogClass extends AnimalClass {
    void bark() {
        System.out.println("Dog is Barking");
    }
}
