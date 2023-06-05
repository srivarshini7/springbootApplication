package com.OOPsConcepts.InheritanceExamples;

  class Shapes{
    public int s;

    public void shapeArea(int s){
        this.s=s;
        System.out.println("Displaying Area according to the Side "+ s);
    }
}

class Square extends Shapes{

    public void Area(int s){
        System.out.println("Area: "+(s*s));
    }
    Square(){
        System.out.println("The Shape is a Square");
    }

}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Square s1=  new Square();
        s1.Area(10);
        s1.shapeArea(10);

    }
}
