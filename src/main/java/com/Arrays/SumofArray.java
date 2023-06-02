package com.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SumofArray {
    public static void main(String[] args) {
        int n;
        int sum=0;
        System.out.println("Enter the size of the Array");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("\nThe Sum of the array is "+sum);
    }
}