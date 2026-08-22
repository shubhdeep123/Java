public class Immutable2 {
    public static void main(String[] args) {
        College college1 = new College("XYZ College", "New York");

        Student student1 = new Student("John", 20,college1);

        System.out.println("college: " + student1.getCollege().name);

        student1.getCollege().name = "ABC College"; 

        System.out.println("college: " + student1.getCollege().name);
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
        this.college = new College(college.name, college.location); // creating a new instance of the mutable object to ensure immutability
    }

    //getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.location); // returning a new instance of the mutable object to ensure immutability
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