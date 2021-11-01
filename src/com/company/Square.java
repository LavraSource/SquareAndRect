package com.company;

public class Square {
    double a;
    double diag;
    public Square(double side){
        a=side;
        diag=Math.sqrt(2*a);
    }
    public Square(){
        a=1;
        diag=Math.sqrt(2);
    }

    public double getA() {
        return a;
    }

    public double getDiag() {
        return diag;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setDiag(double diag) {
        this.diag = diag;
    }
    @Override
    public String toString(){
        return String.format("%d",a);
    }
}
