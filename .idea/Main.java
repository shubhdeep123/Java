class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "XYZ College", 123, 20 );
        Student student2 = new Student("Alice", "ABC College", 456, 22);

        System.out.println("Student 1: " + student1.name + ", " + Student.collegeName + ", " + student1.rollNo + ", " + student1.age);
        System.out.println("Student 2: " + student2.name + ", " + Student.collegeName + ", " + student2.rollNo + ", " + student2.age);

        // Random random1 = new Random(5, 10);
        // Random random2 = new Random(random1);
        // Random random3 = random1; //Pointing to the same object as random1

        // random3.x = 20;
        // random3.y = 30;

        // System.out.println("Random 1: " + random1.x + ", " + random1.y);
        // System.out.println("Random 2: " + random2.x + ", " + random2.y);
        // System.out.println("Random 3: " + random3.x + ", " + random3.y);

        // Random random1 = new Random(5, 10);
        // System.out.println("Random 1: " + random1.x + ", " + random1.y);
        // addTen(random1);
        // System.out.println("Random 1 after addTen: " + random1.x + ", " + random1.y);


        // int x = 10;
        // int y = 20;
        // System.out.println("x: " + x);
        // System.out.println("y: " + y);
        // addTen(x, y);
        // System.out.println("x: " + x);
        // System.out.println("y: " + y);



        // Student student1 = new Student();
        // Student student2 = new Student("John");
        // Student student3 = new Student("Alice", "XYZ College");
        // Student student4 = new Student("Bob", "ABC College", 123);

        // System.out.println("Student 1: " + student1.name + ", " + student1.collegeName + ", " + student1.rollNo + ", " + student1.age);
        // System.out.println("Student 2: " + student2.name + ", " + student2.collegeName + ", " + student2.rollNo + ", " + student2.age);
        // System.out.println("Student 3: " + student3.name + ", " + student3.collegeName + ", " + student3.rollNo + ", " + student3.age);
        // System.out.println("Student 4: " + student4.name + ", " + student4.collegeName + ", " + student4.rollNo + ", " + student4.age);
    }

    static void addTen(Random random) {
        random.x += 10;
        random.y += 10;
    }

    static void addTen(int a, int b) {
        a += 10;
        b += 10;
    }
}

class Random {
    int x;
    int y;
    
    Random(Random random) {
        this.x = random.x;
        this.y = random.y;
    }

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Student {
    String name;
    static String collegeName;
    int rollNo;
    int age;

    Student() {
        this("Unknown");
    }

    Student (String name) {
        this(name, "Unknown College");
    }

    Student (String name, String collegeName) {
        this(name, collegeName, 0);
    }

    Student (String name, String collegeName, int rollNo) {
        this(name, collegeName, rollNo, 0);
    }

    Student(String name, String collegeName, int rollNo, int age) {
        this.name = name;
        this.collegeName = collegeName;
        this.rollNo = rollNo;
        this.age = age;
    }
}