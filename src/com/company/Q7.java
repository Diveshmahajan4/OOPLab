package com.company;

public class Q7 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            long result1 = calculator.power(2, 3);
            System.out.println("2^3 = " + result1);

            long result2 = calculator.power(-1, 5); // Throws exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class Calculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}
