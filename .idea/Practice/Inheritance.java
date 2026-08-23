package Practice;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 35, "Sales");
        Developer developer = new Developer("Bob", 28, "Java");
        Tester tester = new Tester("Charlie", 30, "Selenium");
        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(developer);
        employees.add(tester);

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: " + employee.calculateSalary());
        }
        // Employee employee1 = new Employee("Alice", 30);
        // System.out.println("Employee 1: " + employee1.getName() + ", Age: " + employee1.getAge() + ", Salary: " + employee1.calculateSalary());

        // Manager manager1 = new Manager("Bob", 40, "Sales");
        // System.out.println("Manager 1: " + manager1.getName() + ", Age: " + manager1.getAge() + ", Department: " + manager1.getDepartment() + ", Salary: " + manager1.calculateSalary());
    }
}

abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract int calculateSalary(); // Abstract method to be implemented by subclasses
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int calculateSalary() {
        return 5000; // Salary for a manager
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, String programmingLanguage) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public int calculateSalary() {
        return 4000; // Salary for a developer
    }
}

class Tester extends Employee {
    private String testingTool;

    public Tester(String name, int age, String testingTool) {
        super(name, age);
        this.testingTool = testingTool;
    }

    public String getTestingTool() {
        return testingTool;
    }

    @Override
    public int calculateSalary() {
        return 3500; // Salary for a tester
    }
}
