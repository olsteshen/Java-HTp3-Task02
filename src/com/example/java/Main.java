package com.example.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle round = new Circle(1);
        Oval oval = new Oval(3,1 );
        Square square = new Square(5, 5);
        Rectangle rectangle = new Rectangle(1,3);

        System.out.println("Square of circle " + round.getSquare(1));
        System.out.println("Square of oval " + oval.getSquare(3));
        System.out.println("Square of square " + square.getSquare(5));
        System.out.println("Square of rectangle " + rectangle.getSquare(5));
    }
}
