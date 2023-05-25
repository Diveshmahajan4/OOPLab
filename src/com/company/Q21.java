package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q21 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");

        student.displayCourses();

        student.removeCourse("Science");

        student.displayCourses();
    }
}
    class Student {
        private String name;
        private int grade;
        private List<String> courses;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
            this.courses = new ArrayList<>();
        }

        public void addCourse(String course) {
            courses.add(course);
        }

        public void removeCourse(String course) {
            courses.remove(course);
        }

        public void displayCourses() {
            System.out.println("Courses for " + name + ":");
            for (String course : courses) {
                System.out.println(course);
            }
        }
    }

