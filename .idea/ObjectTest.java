    import java.util.Objects;
    
    public class ObjectTest {
        public static void main(String[] args) {
            Employee employee1 = new Employee();
            employee1.name = "John";
            employee1.age = 20;
            Employee employee2 = new Employee();
            employee2.name = "John";
            employee2.age = 20;

            System.out.println(employee1 instanceof Object); // true, because employee1 is an instance of Employee class
            // System.out.println(employee1 instanceof Employee); // true, because employee1 is an instance of Employee class
            // System.out.println(employee1.hashCode() == employee2.hashCode()); // prints the hash code of employee1
            // System.out.println(employee1 == employee2); // false, because they are different objects in memory
            // System.out.println(employee1.equals(employee2)); // false, because the default equals() method in Object class compares memory addresses, not the content of the objects
            // System.out.println(employee1);
            // System.out.println(employee2.getClass().getName());
            // // System.out.println("Name: " + employee1.name);
            // // System.out.println("Age: " + employee1.age);
        }
    }

    class Employee {
        String name;
        int age;

        Employee() {
            this.name = "Default Name";
            this.age = 0;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Employee employee = (Employee) obj;
            return age == employee.age && name.equals(employee.name);
        }

        @Override
        public int hashCode() {
            // int result = name.hashCode();
            // result = 31 * result + age;
            // return result;

            return Objects.hash(name, age);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
