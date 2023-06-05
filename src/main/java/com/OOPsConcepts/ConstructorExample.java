package com.OOPsConcepts;



class Students{
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
//    Non parameterised Constructor
     Students(){
         System.out.println("Student data Info");
     }
}

class StudentData{
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
    //    Parameterised Constructor
    StudentData(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Students pupil1 = new Students();
        pupil1.name = "Cardan";
        pupil1.age= 24;
        pupil1.percentage= 87.6;

        pupil1.printName();
        pupil1.printInfo();
        pupil1.printScore();


        StudentData s2 = new StudentData("Oak", 12);
        s2.printInfo();
    }
}
