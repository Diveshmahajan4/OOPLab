package com.company;

// Question : You are given a phone book that consists of people's names
// and their phone number. After that you will be given some person's name
// as query. For each query, print the phone number of that person. Use
// HashMap to implement it.The first line will have an integer denoting
// the number of entries in the phone book. Each entry consists of two
// lines: a name and the corresponding phone number.
//After these, there will be some queries. Each query will contain a person
// 's name. Read the queries until end-of-file.
//Constraints:
//A person's name consists of only lower-case English letters and it may
// be in the format 'first-name last-name' or in the format 'first-name'.
// Each phone number has exactly 8 digits without any leading zeros.For
// each case, print "Not found" if the person has no entry in the phone
// book. Otherwise, print the person's name and phone number.

import java.util.HashMap;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);

        // Read the number of entries
        int numEntries = in.nextInt();
        in.nextLine(); // Consume the newline character

        // Read the phone book entries
        for (int i = 0; i < numEntries; i++) {
            String name = in.nextLine();
            String phoneNumber = in.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Process the queries
        while (in.hasNextLine()) {
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                String phoneNumber = phoneBook.get(query);
                System.out.println(query + " " + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
