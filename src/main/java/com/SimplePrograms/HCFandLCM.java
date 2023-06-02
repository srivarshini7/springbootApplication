package com.SimplePrograms;
import java.util.Scanner;
public class HCFandLCM {
    public static void main(String[] args) {
        System.out.println("Enter the two values");
        Scanner s = new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        int temp1,temp2,temp;
        temp1=a;
        temp2=b;
        while(temp2!=0){
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }
        System.out.println("The HCF of "+ a+ " and "+ b+" is "+temp1);
        int lcm = (a*b)/temp1;
        System.out.println("The LCM of "+ a+ " and "+ b+" is "+lcm);
    }
}