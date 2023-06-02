package com.SimplePrograms;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main (String[] args){
        int a;
        System.out.println("Enter the number");
        Scanner s= new Scanner(System.in);
        a = s.nextInt();
        System.out.println("The Factors of "+ a+ " are:");
        for(int i=1;i<a;i++){
            if(a%i==0){
                System.out.print(i +" ");
            }
        }
    }
}