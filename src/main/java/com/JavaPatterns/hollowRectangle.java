package com.JavaPatterns;

import java.util.*
        ;

public class hollowRectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length and width of the rectangle");
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int b =s.nextInt();
        System.out.println("The Rectangle is: ");
        for(int i=1;i<=b;i++){
            for(int j=1;j<=a;j++){
                if(i==1 ||i==b ||j==1||j==a){
                    System.out.print("*"+"  ");
                }
                else{
                    System.out.print(" "+"  ");
                }
            }
            System.out.println();
        }
    }

}
