public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        System.out.println(animal.getClass().getName()); // prints the class name of animal
        System.out.println(dog.getClass().getName()); // prints the class name of dog

        System.out.println(animal instanceof Animal); // true, because animal is an instance of Animal class
        System.out.println(dog instanceof Animal); // true, because dog is an instance of Dog class, which is a subclass of Animal
        System.out.println(dog instanceof Dog); // true, because dog is an instance of Dog class
        System.out.println(animal instanceof Dog); // false, because animal is not an instance of Dog class
    }
}

class Animal {

}

class Dog extends Animal {

}
