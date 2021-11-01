package com.company;

public class Rect extends Square {
    double a;
    double diag;
    double b;
    public Rect(double side, double side2) {
        a = side;
        diag = Math.sqrt(b * b + a * a);
        b=side2;
    }

    public Rect() {
        a = 1;
        diag = Math.sqrt(5);
        b=2;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double area(){
        return a*b;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", a, b);
    }
}
