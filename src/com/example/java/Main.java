package com.example.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle circle = new Circle(1);
        Oval oval = new Oval(3, 5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(1,3);

        System.out.println("Square of circle " + circle.getSquare(circle.radius));
        System.out.println("Square of oval " + oval.getSquare(oval.radius));
        System.out.println("Square of square " + square.getSquare(square.a));
        System.out.println("Square of rectangle " + rectangle.getSquare(rectangle.a));
    }
}
