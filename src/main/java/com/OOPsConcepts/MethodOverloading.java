package com.OOPsConcepts;

class Artist{
    int age;
    String name;
    public void artInfo(String name){
        this.name=name;
        System.out.println("Name: "+ name);
    }
    public void artInfo(int age){
        this.age=age;
        System.out.println("Age: "+ age);
    }
    public void artInfo(String name,int age ){
        this.name=name;
        this.age=age;
        System.out.println("Name: "+ this.name+ " Age: "+ this.age);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Artist a1 = new Artist();
        a1.artInfo("Kiera",20);
    }
}
