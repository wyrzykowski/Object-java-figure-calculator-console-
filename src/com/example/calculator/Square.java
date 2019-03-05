package com.example.calculator;

public class Square extends Figure implements Print{
    double a,b;
    public Square(double as, double bs){
        a=as;
        b=bs;
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Side a and b must be >= 0");
        }
    }
    @Override//Adnotacja oznacza nadpisanie metody już istniejacej lub interfejsu
    public double calculateArea(){
        return a*b;
    }
    @Override
    public double calculatePerimeter(){
        return a*2+b*2;
    }
    @Override
    public void print(){
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }
}
