package com.company;

public class Q22 {
    public static void main(String[] args) {
        PersonQ22 person = new PersonQ22("John", "Doe");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        EmployeeQ22 employee = new EmployeeQ22("Jane", "Smith", 12345, "Manager");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name (with job title): " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
class PersonQ22 {
    private String firstName;
    private String lastName;

    public PersonQ22(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class EmployeeQ22 extends PersonQ22 {
    private int employeeId;
    private String jobTitle;

    public EmployeeQ22(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}
