package com.TypeCasting;

import java.util.Scanner;

public class TypeCastingImplicit {
    public static void main(String[] args) {
        System.out.println("Enter the integer value");
        Scanner s = new Scanner(System.in);
        int myInt = s.nextInt();
        double myDouble = myInt;

        System.out.println("The given Integer value is: "+myInt);
        System.out.println("The converted value is: "+myDouble);
    }
}
