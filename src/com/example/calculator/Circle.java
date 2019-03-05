package com.example.calculator;

public class Circle extends Figure implements Print {
    double r;
    Circle(double rs){
        r=rs;
        if (r < 0) {
            throw new IllegalArgumentException("Radius must be >= 0: " + r);
        }
    }
    @Override
    double calculateArea(){
        return Math.PI*r*r;
    }
    @Override
    double calculatePerimeter(){
        return 2*Math.PI *r;
    }
    @Override
   public void print(){
       System.out.println("Radius: " + r);
       System.out.println("Perimeter: " + calculatePerimeter());
       System.out.println("Area: " + calculateArea());
    }

}
