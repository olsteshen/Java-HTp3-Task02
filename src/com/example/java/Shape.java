package com.example.java;

public interface Shape {
    double getSquare();
}

abstract class Round implements Shape{
    static final double PI = 3.14159d;
    double radius;
    double bigR;
    public abstract double getSquare();
}

class Circle extends Round {
    public Circle(double r) {
        this.radius = r;
    }
    @Override
    public double getSquare() {
        return PI*radius*radius;
    }
}

class Oval extends Round {
    public Oval(double r, double big){
        this.radius=r;
        this.bigR=big;
    }
    @Override
    public double getSquare() {
        return PI*radius*bigR;
    }
}

abstract class Rectangular implements Shape{
    double a;
    double b;
    public abstract double getSquare();
}

class Square extends Rectangular {
    public Square(double a){
        this.a = a;
    }
    @Override
    public double getSquare(){
        return (a*a);
    }
}

class Rectangle extends Rectangular {
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getSquare() {
        return (a*b);
    }
}
