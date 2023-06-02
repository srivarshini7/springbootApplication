package com.SimplePrograms;
import java.util.Scanner;

public class Addition {
    public static void main (String [] args){
        int a,b;
        System.out.println("Enter the Two Values");
        Scanner s = new Scanner(System.in);
        a= s.nextInt();
        b=s.nextInt();
        int c= a+b;
        System.out.println("The Sum of the two numbers is "+ c);
    }
}
