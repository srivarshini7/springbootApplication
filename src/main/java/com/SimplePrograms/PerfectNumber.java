package com.SimplePrograms;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        System.out.println("Enter the Number");
        Scanner s = new Scanner(System.in);
        int n;
        int count =0;
        n =s.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                count =count+i;
            }
        }
        if(count==n){
            System.out.println(n+" is a Perfect Number");
        }
        else{
            System.out.println(n+" is not a Perfect Number");
        }

    }
}