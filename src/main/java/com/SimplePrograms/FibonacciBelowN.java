package com.SimplePrograms;

import java.util.Scanner;

public class FibonacciBelowN {
    public static void main(String[] args){
        System.out.println("Enter the Value of N");
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int a =0;
        int b =1;
        int sum = 0;
        System.out.println("The Fibonacci series below "+ n+" is ");
        System.out.print(a +" " +b);
        for(int i=1;i<100;i++){
            sum = a + b;
            if(sum<n) {
                System.out.print(" " + sum);
                a = b;
                b = sum;
            }
        }
    }
}