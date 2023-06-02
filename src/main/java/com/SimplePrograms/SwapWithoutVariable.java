package com.SimplePrograms;
import java.util.Scanner;
public class SwapWithoutVariable {
    public static void main(String[] args){
        System.out.println("enter the values for swapping");
        Scanner s= new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        int c;
        System.out.println("the value of a before swapping is " + a);
        System.out.println("the value of b before swapping is " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("the value of a after swapping is " + a);
        System.out.println("the value of b after swapping is " + b);
    }
}