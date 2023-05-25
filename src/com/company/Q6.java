package com.company;

// Question : 6. Write the following code in your editor below:
//A class named Arithmetic with a method named add that takes 2 integers
// as parameters and returns an integer denoting their sum.
//A class named Adder that inherits from a superclass named Arithmetic.
// The main method in the Tester class should
// print the following: SAMPLE O/P:My superclass is: Arithmetic
//42 13 20

public class Q6 {
    public static void main(String[] args) {
        Adder adder = new Adder();

        int num1 = 42;
        int num2 = 13;

        int sum = adder.add(num1, num2);
        System.out.println(num1 + " " + num2 + " " + sum);
    }
}

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    public Adder() {
        System.out.println("My superclass is: Arithmetic");
    }
}



