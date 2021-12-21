package com.example.java;

public interface Shape {
    double getSquare(double a);
}

abstract class Round implements Shape{
    final static double pi = 3.14159d;
    double radius;
    double bigR;
    public abstract double getSquare(double r);
}

class Circle extends Round {
    public Circle(double r) {
        this.radius = r;
    }
    @Override
    public double getSquare(double r) {
        return pi*radius*radius;
    }
}

class Oval extends Round {
    public Oval(double r, double big){
        this.radius=r;
        this.bigR=big;
    }
    public double getSquare(double r) {
        return pi*radius*bigR;
    }
}

abstract class Rectangular implements Shape{
    double a;
    double b;
    public abstract double getSquare(double a);
}

class Square extends Rectangular {
    public Square(double a){
        this.a = a;
    }
    public double getSquare(double a){
        return (a*a);
    }
}

class Rectangle extends Rectangular {
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getSquare(double a) {
        return (a*b);
    }
}
