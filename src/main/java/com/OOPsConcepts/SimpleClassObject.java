package com.OOPsConcepts;
import java.util.Scanner;

class Pen{
    String color;
    String type;
    int weight;
    public void write(){
        System.out.println("Writes well in "+ color+ ". "+" It's a "+ type +" pen. ");
        if(weight<10){
            System.out.println("It's a light weight pen. Good choice!");
        }
        else{
            System.out.println("It might be a bit heavy pen. Please consider other options.");
        }
    }
}


public class SimpleClassObject {
    public static void main(String[] args) {
        System.out.println("The Pen data Display\nEnter the color, type, weight of the pen");
        Scanner s= new Scanner(System.in);
        Pen pen1 =new Pen();
        pen1.color = s.next();
        pen1.type = s.next();
        pen1.weight = s.nextInt();

        pen1.write();
    }
}
