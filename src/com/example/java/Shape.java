package com.example.java;

public interface Shape {
    double pi = 3.14159d;
    double getSquare(double a);
}

abstract class Round implements Shape{
    double r;
    public Round(double smR){
        r=smR;
    }
    public abstract double getSquare(double r);
}

abstract class Rectangular implements Shape{
    double a;
    double b;
    Rectangular(double i, double j){
        this.a=i;
        this.b=j;
    }
    public abstract double getSquare(double a);
}

class Circle extends Round {
    public Circle(double r) {
        super(r);
    }
    @Override
    public double getSquare(double r) {
        return pi*r;
    }
}

class Oval extends Round {
    double bigR;
    public Oval(double r, double big){
        super(r);
        this.bigR=big;
    }
    public double getSquare(double r) {
        return pi*r*this.bigR;
    }
}

class Square extends Rectangular {
    public Square(double a, double b){
        super(a,b);
    }

    public double getSquare(double a){
        return (a*this.b);
    }
}

class Rectangle extends Rectangular {
    public Rectangle(double a, double b){
        super(a,b);
    }
    public double getSquare(double a) {
        return (a*this.b);
    }
}
