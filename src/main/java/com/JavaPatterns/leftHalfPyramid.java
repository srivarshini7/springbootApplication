package com.JavaPatterns;

import java.util.Scanner;

public class leftHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the size of the Pyramid");
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("The Pyramid:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
