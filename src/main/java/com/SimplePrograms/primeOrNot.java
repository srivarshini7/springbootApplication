package com.SimplePrograms;
import java.util.Scanner;
public class primeOrNot {
    public static void main(String[] args){
        int n;
        int count= 0;
        System.out.println("Enter the Number");
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }
}