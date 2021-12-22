package com.example.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle circle = new Circle(1);
        Oval oval = new Oval(3, 5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(1,3);

        System.out.println("Square of circle " + circle.getSquare());
        System.out.println("Square of oval " + oval.getSquare());
        System.out.println("Square of square " + square.getSquare());
        System.out.println("Square of rectangle " + rectangle.getSquare());
    }
}
