package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Generics with lower bound
public class LowerBoundType {
    public static void main(String[] args) {
        List<AnimalBound> animals = new ArrayList<>();
        animals.add(new AnimalBound());
        animals.add(new AnimalBound()); 
        fun(animals);
    }

    public static void fun(List<? super AnimalBound> values) {
        // writing this is allowed
        // values.add(new AnimalBound());
        values.add(new Labrador());

        // this reading is not allowed
        // for (AnimalBound a : values) {
            
        // }

        // Reading can be down only using Object class
        for(Object obj : values) {
            AnimalBound a = (AnimalBound) obj;
            a.eat();
        }
    }
}

// Animal class was already created so this name used for this practice
class AnimalBound {
    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class DogBound extends AnimalBound {
    void bark() {
        System.out.println("Dog Barking");
    }
}

class Labrador extends DogBound {
    @Override
    void eat() {
        System.out.println("Labrador Eating");
    }
    void run() {
        System.out.println("Labrador Running");
    }
}


