package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        HashMap<String, Integer> wordCountMap = countWords(input);

        System.out.println(wordCountMap);
    }

    public static HashMap<String, Integer> countWords(String input) {
        String[] words = input.split(" ");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
