/*3. Project Title: Simple MY A T M
Description:
Create a Java program that simulates a simple ATM (Automated Teller
Machine). The program should allow users to check their balance, deposit
money, and withdraw money. It should continue to perform transactions until
the user chooses to exit.
Project Requirements:
i. Use if-else statements to determine the user's choice of transaction.
ii. Utilise loops to allow the user to perform multiple transactions.
iii. Create a menu-driven program using a switch-case structure.*/

import java.util.Scanner;

public class Scalculator {
    Scanner scn=new Scanner(System.in);
    char ch;
    int choice;
    double bal=0;

    void ATMAvail(){
        System.out.println("WELCOME TO MY A T M");;
        System.out.println("\n\nMenu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("Enter Your Choice: ");
        choice=scn.nextInt();
        if(choice>=1&&choice<=3)
            ATMOperation();
        else
            System.out.println("INVALID INPUT");

    }

    void ATMOperation(){
        if(choice==1)
            CheckBalance();
        if(choice==2)
            Deposit();
        if(choice==3)
            Withdraw();
    }

    void CheckBalance(){
        System.out.println("Available Balalnce: Rs."+bal);
    }

    void Deposit(){
        System.out.println("Deposit Amount: ");
        double da=scn.nextDouble();
        if(da<=0)
            System.out.println("Invalid Deposit Amount");
        else{
            bal+=da;
            System.out.println("Deposit of Rs."+da+" is successful");
            CheckBalance();
        }
    }

    void Withdraw(){
        System.out.println("Enter Withdrawal Amount: ");
        double wd=scn.nextDouble();
        if(wd<=0)
            System.out.println("Invalid Withdrawal Amount");
        else{
            bal-=wd;
            System.out.println("Withdrawal of Rs."+wd+" is successful");
            CheckBalance();
        }
    }

    public static void main(String[] args) {
        Scalculator as = new Scalculator();
        do{
            as.ATMAvail();
            System.out.println("Do you want to continue(y/n): ");
            as.ch=as.scn.next().charAt(0);
        }while(as.ch=='y'||as.ch=='Y');

    }
}