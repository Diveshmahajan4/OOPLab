package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        reverseString();
        palindrome();
    }

    public static void reverseString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = in.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }

    //Second Question :check that String is palindrome or not.
    public static void palindrome(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = in.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println((sb.toString().equals(s)) ? "YES" : "NO");
    }
}
