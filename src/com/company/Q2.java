package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
//        countDuplicateNumbers();
        eInUmbrella();
    }

    // First Question : Java Program to Count Number of Duplicate Words in String
    public static void countDuplicateNumbers(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = in.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(char x : map.keySet()){
            if(map.get(x) > 1){
                count++;
            }
        }

        System.out.printf("There are %d duplicate words" , count);
    }

    // Second Question : How to Check if the String Contains 'e' in umbrella
    public static void eInUmbrella(){
        String s = "Umbrella";
        System.out.println(s.contains("e"));
    }
}
