package com.company;

public class Q24 {
    public static void main(String[] args) {
        try {
            StudentQ24 student = new StudentQ24(101, "John Doe", 18, "Computer Science");
            student.displayDetails();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class StudentQ24 {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public StudentQ24(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException,
            NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        if (!name.matches("^[a-zA-Z ]+$")) {
            throw new NameNotValidException("Name should contain only alphabets and spaces.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
