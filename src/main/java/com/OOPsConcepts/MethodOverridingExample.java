package com.OOPsConcepts;

class TheShapes {
    public void area() {
        System.out.println("The formula for area of ");
    }
}
class Triangle extends TheShapes {
    public void area() {
        System.out.println("Triangle is ½ * base * height ");
    }
}
class Circle extends TheShapes {
    public void area() {
        System.out.println("Circle is 3.14 * radius * radius ");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        TheShapes myShape = new TheShapes();  // Create a Shapes object
        TheShapes myTriangle = new Triangle();  // Create a Triangle object
        TheShapes myCircle = new Circle();  // Create a Circle object
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
    }
}
