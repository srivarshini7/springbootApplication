package com.JavaPatterns;

import java.util.Scanner;

public class rightHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the height of the half pyramid");
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
