package com.company;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows (half of the diamond) : ");
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("*");
            System.out.println(sb);
        }
        for (int i = 0; i < n; i++) {
            sb.delete(0, 1);
            System.out.println(sb);
        }
    }
}
