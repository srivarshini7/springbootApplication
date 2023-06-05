package com.OOPsConcepts;
import java.util.*;

class Student{
    String name;
    int age;
    double percentage;
    public void printName(){
        System.out.println("Student's Name: "+ this.name);
    }
    public void printInfo(){
        System.out.println("Student's Name: "+ this.name+" age: "+this.age);
    }
    public void printScore(){
        System.out.println("Student's Score: "+ this.percentage);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        Student pupil1 = new Student();
        pupil1.name = "Cardan";
        pupil1.age= 24;
        pupil1.percentage= 87.6;

        Student pupil2 = new Student();
        pupil2.name = "Jude";
        pupil2.age= 23;
        pupil2.percentage= 95.7;

        pupil1.printName();
        pupil1.printInfo();
        pupil1.printScore();


        pupil2.printName();
        pupil2.printInfo();
        pupil2.printScore();

    }
}
