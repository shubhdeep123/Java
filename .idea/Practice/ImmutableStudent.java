    package Practice;
    public class ImmutableStudent {
        public static void main (String[] args) {
            School school = new School("ABC School");
            SchoolStudent student = new SchoolStudent("John", 20, school);
            School school1 = student.getSchool();
            school1.schoolName = "XYZ School"; // This will not affect the original school object
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("School Name: " + student.getSchool().schoolName);
        }

        public static int main (int args) {
            return 0;
        }
    }


    final class SchoolStudent {
        private final String name;
        private final int age;
        private final School school;

        SchoolStudent(String name, int age, School school) {
            this.name = name;
            this.age = age;
            this.school = new School(school.schoolName);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public School getSchool() {
            return new School(school.schoolName);
        }
    }

    class School {
        public String schoolName;

        School(String schoolName) {
            this.schoolName = schoolName;
        }
    }
