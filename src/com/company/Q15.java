package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Q15 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Using for-loop:");
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
        }

        System.out.println("\nUsing iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        System.out.println("\nUsing enhanced for-loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
