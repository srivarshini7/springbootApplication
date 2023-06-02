package com.JavaPatterns;

import java.util.Scanner;

public class fullReactangle {
    public static void main(String[] args) {
        System.out.println("Enter the length and width of the rectangle");
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int b =s.nextInt();
        System.out.println("The Rectangle is: ");
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}
