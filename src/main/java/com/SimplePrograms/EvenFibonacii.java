package com.SimplePrograms;
import java.util.Scanner;
public class EvenFibonacii {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner s =new Scanner(System.in);
        int num;
        int sum =0;
        num =s.nextInt();
        System.out.println("The even Numbers of fibonacci series");
        int a= 0;
        int b= 1;
        System.out.print(a);
        for(int i=1;i<=100;i++){
            sum = a + b;
            if(sum<=num) {
                if (sum % 2 == 0) {
                    System.out.print(" " + sum);
                }
                a = b;
                b = sum;
            }
        }
    }
}