package com.JavaPatterns;

import java.util.Scanner;

public class inverseRightHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the height of the half pyramid");
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
