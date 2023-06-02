package com.SimplePrograms;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main (String [] args){
        System.out.println("Enter the Number");
        Scanner s = new Scanner(System.in);
        int a;
        a=s.nextInt();
        if(a%2==0){
            System.out.println(a+ " is an Even Number");
        }
        else{
            System.out.println(a+ " is an Odd Number");
        }
    }

}