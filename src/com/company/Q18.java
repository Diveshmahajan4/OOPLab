package com.company;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        // Accept data for 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Age: ");
            int age = in.nextInt();
            in.nextLine(); // Consume the remaining newline character

            System.out.print("Designation: ");
            String designation = in.nextLine();
            System.out.print("Salary: ");
            double salary = in.nextDouble();
            in.nextLine(); // Consume the remaining newline character

            employees[i] = new Employee();
            employees[i].setData(name, age, designation, salary);
        }

        // Display the names of employees with salary > 5000
        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.getSalary() > 5000) {
                System.out.println(employee.getName());
            }
        }
    }
}

class Person {
    protected String name;
    protected int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public void setData(String name, int age, String designation, double salary) {
        super.setData(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
