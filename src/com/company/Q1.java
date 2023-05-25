package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        findCommonElements();
    }

    // First Question : Program to remove all repeated elements from an array
    public static void removeAllDuplicate(){
        Scanner in = new Scanner(System.in);
        // Take input of Array
        System.out.print("Enter the size of Array: ");
        int size = in.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                list.add(arr[i]);
                i++;
            }else{
                list.add(arr[i]);
            }
        }

        for(int x: list){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Second Question : find the common elements between two arrays of integers
    public static void findCommonElements(){
        Scanner in = new Scanner(System.in);
        // Take input of Array1
        System.out.print("Enter the size of Array1: ");
        int size1 = in.nextInt();
        System.out.println("Enter the elements in the array1: ");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) arr1[i] = in.nextInt();

        // Take input of Array2
        System.out.print("Enter the size of Array2: ");
        int size2 = in.nextInt();
        System.out.println("Enter the elements in the array2: ");
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) arr2[i] = in.nextInt();

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int x: arr1){
            set.add(x);
        }

        for(int x: arr2){
            if(set.contains(x)){
                list.add(x);
            }
        }

        for(int x: list){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
