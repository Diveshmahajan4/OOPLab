package com.company;

// Question : 5. We have to calculate the percentage of marks obtained
// in three subjects (each out of 100) by student A and in four subjects
// (each out of 100) by student B. Create an abstract class 'Marks' with
// an abstract method 'getPercentage'. It is inherited by two other
// classes 'A' and 'B' each having a method with the same name which
// returns the percentage of the students. The constructor of student
// A takes the marks in three subjects as its parameters and the marks
// in four subjects as its parameters for student B. Create an object
// for eac of the two classes and print the percentage of marks for both
// the students.

public class Q5 {
    public static void main(String[] args) {
        A a = new A(89, 56 ,78);
        B b = new B(89, 65, 78, 91);
        System.out.println("Percentage of Student A: " + a.getPercentage());
        System.out.println("Percentage of Student B: " + b.getPercentage());
    }
}

abstract class Marks{
    public abstract double getPercentage();
}

class A extends Marks{
    private int s1;
    private int s2;
    private int s3;

    public A(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double getPercentage(){
        return (double) (s1+s2+s3)/3;
    }
}

class B extends Marks{
    private int s1;
    private int s2;
    private int s3;
    private int s4;

    public B(int s1, int s2, int s3, int s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    public double getPercentage(){
        return (double) (s1+s2+s3+s4)/4;
    }
}

