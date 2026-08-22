public class Immutable2 {
    public static void main(String[] args) {

    }
}


// Immutable class
// defensive copy of mutable object inside the immutable class
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    //getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return college;
    }
}


// Mutable class
class College {
    String name;
    String location;

    College(String name, String location) {
        this.name = name;
        this.location = location;
    }


}