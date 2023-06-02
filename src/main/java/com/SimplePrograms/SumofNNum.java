package com.SimplePrograms;
import java.util.Scanner;

public class SumofNNum {
    public static void main(String[] args){
        System.out.println("Enter the value of N");
        Scanner s= new Scanner(System.in);
        int n;
        int sum =0;
        n= s.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum +i;
        }
        System.out.println("The Sum of "+ n+" numbers is: " +sum);
    }
}