
 /*2. Project Title: Simple Calculator
Description:
Create a Java program that acts as a simple calculator. The program should
ask the user to input two numbers and then perform basic arithmetic
operations (addition, subtraction, multiplication, division). It should continue to
perform calculations until the user chooses to exit.
Project Requirements:
i. Utilise if-else statements for selecting the operation.
ii. Use loops to allow the user to perform multiple calculations.*/

import java.util.Scanner;

public class CalcArithmetic {
    Scanner scn=new Scanner(System.in);
    char ch='y';
    int op;
    double res;

    void DisplayResult(){
        System.out.println("Result: "+res);
    }

    void Calculate(){
        double a,b;
        System.out.println("Enter Value of a & b: ");
        a=scn.nextDouble();
        b= scn.nextDouble();
        if(op==1)
            res=a+b;
        if(op==2)
            res=a-b;
        if(op==3)
            res=a*b;
        if(op==4)
            res=a/b;
        DisplayResult();
    }

    void GetInput(){
        System.out.println("Choose from the following option");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        op=scn.nextInt();
        if(op>=1&&op<=4)
            Calculate();
        else
            System.out.println("Invalid Input");

    }
    public static void main(String[] args) {
        CalcArithmetic c=new CalcArithmetic();
        do{
            c.GetInput();
            System.out.println("Do you want to continue(y/n): ");
            c.ch=c.scn.next().charAt(0);
        }while(c.ch=='y'||c.ch=='Y');
    }
}   

