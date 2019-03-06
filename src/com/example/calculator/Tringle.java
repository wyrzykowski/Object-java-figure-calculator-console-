package com.example.calculator;

public class Tringle extends Figure implements Print{
    public double a,b,c;
    public Tringle(double as, double bs,double cs){
        a=as;
        b=bs;
        c=cs;
        if (a < 0 || b < 0 || c< 0) {
            throw new IllegalArgumentException("Side a,b and c must be >= 0");
        }
        if (a + b <= c || a + c <= b || b + c <= a ) {
            throw new IllegalArgumentException("Cannot build Tringle with given sides.");
        }
    }
    @Override
    public double calculateArea(){
   double p = (a+b+c)/2;
return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    double calculatePerimeter(){
        double perimeter = a+b+c;
        return perimeter;
    }
    @Override
    public void print(){
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Side c: " + c);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }

}
