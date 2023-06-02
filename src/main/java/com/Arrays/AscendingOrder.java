package com.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class AscendingOrder {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the size of the array");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int[] array = new int [n];
        for(int i=0;i<n;i++){
            array[i] = s.nextInt();
        }
        System.out.println("The input array is");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("\nThe Sorted array in ascending order is");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}