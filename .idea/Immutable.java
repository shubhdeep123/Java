public class Immutable {
    public static void main(String[] args) {
        College college1 = new College("XYZ College", "New York");
        College college2 = new College("ABC College", "Los Angeles");

        Student student1 = new Student("John", 20,college1);
        Student student2 = new Student("Alice", 22,college2);

        // shallow copy of mutable object inside the immutable class
        student1.getCollege().name = "Modified College Name"; // Modifying the mutable object inside the immutable class

        System.out.println("Student 1: " + student1.getName() + ", " + student1.getAge() + ", " + student1.getCollege().name);
        System.out.println("Student 2: " + student2.getName() + ", " + student2.getAge() + ", " + student2.getCollege().name);

    }
}

// immutable class (Not Purely Immutable class because it has a mutable object as a field)
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