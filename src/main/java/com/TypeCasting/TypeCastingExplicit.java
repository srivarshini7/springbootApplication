package com.TypeCasting;

import java.util.Scanner;

public class TypeCastingExplicit {
    public static void main(String[] args) {
        System.out.println("Enter the Decimal Value");
        Scanner s= new Scanner(System.in);
        double myDouble = s.nextDouble();
        int myInt = (int) myDouble;

        System.out.println("The given Decimal value is: "+myDouble);
        System.out.println("The converted value is: "+myInt);
    }
}
