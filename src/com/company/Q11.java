package com.company;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
//        multiTable();
        isPrime();
    }

    public static void multiTable(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int ans = 0;

        for (int i = 1; i < 11; i++) {
            ans += num;
            System.out.printf("%d x %d = %d", num, i, ans);
            System.out.println();
        }
        System.out.println();
    }

    public static void isPrime(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not prime number.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime number.");
                return;
            }
        }

        System.out.println(num + " is a prime number.");
    }
}
