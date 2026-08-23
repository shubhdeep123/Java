package Practice;

public class PersonClass {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 50000, "IT");
        System.out.println(manager);
    }
}

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager{name='" + super.getName() + "', salary=" + super.getSalary() + ", department='" + department + "'}";
    }
}