package com.example.calculator;
import java.util.Scanner;

public class UserInterface {

    void startInterface()
    {
        System.out.println("Calculator\n ");

        while(true){
            System.out.println("Choose figure: \n 1. Circle \n 2. Tringle \n 3. Square \n 0. Quit");
            Scanner scan = new Scanner(System.in);
            int userchoose = scan.nextInt();
            switch(userchoose){
                case 1:
                    System.out.println("Choosed Circle");
                    System.out.println("Set radious:");
                    double r = scan.nextDouble();
                    Circle circle;
                    try{  circle= new Circle(r);
                        circle.print();}
                    catch(IllegalArgumentException exception){ System.out.println(exception);}


                    break;
                case 2:
                    System.out.println("Choosed Tringle");
                    System.out.println("Set a side:");
                    double a = scan.nextDouble();
                    System.out.println("Set b side:");
                    double b = scan.nextDouble();
                    System.out.println("Set c side:");
                    double c = scan.nextDouble();
                    Tringle tringle;
                    try{ tringle= new Tringle(a,b,c); tringle.print();}
                    catch(IllegalArgumentException exception){System.out.println(exception);};
                    break;
                case 3:
                System.out.println("Choosed Square");
                System.out.println("Set a side:");
                double asq = scan.nextDouble();
                System.out.println("Set b side:");
                double bsq = scan.nextDouble();
                Square square;
                try {
                    square = new Square(asq, bsq);
                    square.print();
                }
                catch(IllegalArgumentException exception){
                    System.out.println(exception);
                }
                break;
                case 0:
                    System.out.println("Good bye.");
                    return;
                default:
                    System.out.println("Bad number!");
            }

        }

    }
}
