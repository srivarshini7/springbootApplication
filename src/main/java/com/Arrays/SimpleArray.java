package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Size of the Array");
        Scanner s= new Scanner(System.in);
        n =s.nextInt();
        System.out.println("Enter the elements of the Array");
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("The elements of the array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}