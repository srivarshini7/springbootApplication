package com.OOPsConcepts;
import java.util.*;

class StudentInfo{
    String name;
    int age;

    public void studentData(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
    }

    StudentInfo(StudentInfo s2){
        this.name= s2.name;
        this.age= s2.age;
    }
    StudentInfo(){

    }
        }

public class CopyConstructor {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.name = "Chase";
        s1.age = 22;

        StudentInfo s2 = new StudentInfo(s1);
        s2.studentData();

    }
}
