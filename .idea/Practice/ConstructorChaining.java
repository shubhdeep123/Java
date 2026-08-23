package Practice;

public class ConstructorChaining {
    public static void main(String[] args) {
        NicePerson person1 = new NicePerson();
        System.out.println("Person 1: " + person1);

        NicePerson person2 = new NicePerson("John");
        System.out.println("Person 2: " + person2);

        NicePerson person3 = new NicePerson("Alice", 25);
        System.out.println("Person 3: " + person3);

        NicePerson person4 = new NicePerson("Bob", 30, "123 Main St");
        System.out.println("Person 4: " + person4);
    }
}

class NicePerson {
    private String name;
    private int age;
    private String address;

    public NicePerson() {
        this("Unknown", 0, "Unknown");
    }

    public NicePerson(String name) {
        this(name, 0, "Unknown");
    }

    public NicePerson(String name, int age) {
        this(name, age, "Unknown");
    }

    public NicePerson(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }

}
