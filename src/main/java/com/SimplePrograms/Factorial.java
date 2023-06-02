package com.SimplePrograms;
import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
        int num, fact;
        System.out.println("Enter the number");
        Scanner s= new Scanner(System.in);
        num=s.nextInt();
        fact =1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("The Factorial of "+ num +" is "+fact);
    }
}