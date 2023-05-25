package com.company;

import java.io.*;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) throws IOException {
        countWords();
//        whenWriteStringUsingBufferedWritter_thenCorrect();
    }

    public static void countWords() {
        File file = new File("D:\\VIT PUNE\\Sem-4\\OOPs\\LabExamSolutions\\src\\com\\company\\input.txt"); // Replace "input.txt" with the path to your text file
        int count = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Number of words: " + count);
    }
}
