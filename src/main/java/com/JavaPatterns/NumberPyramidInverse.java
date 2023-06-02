package com.JavaPatterns;

import java.util.Scanner;

public class NumberPyramidInverse {
    public static void main(String[] args) {
        System.out.println("Enter the Value of N");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
