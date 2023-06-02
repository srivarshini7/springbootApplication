package com.JavaPatterns;

import java.util.Scanner;

public class ContinuousNumberPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of line");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int x=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                x=x+1;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
