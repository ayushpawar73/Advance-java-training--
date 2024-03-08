import java.util.Scanner;

public class Interex implements Client {
    String Name;
    String Salary;
    Scanner sc=new Scanner(System.in);
    public void input(){

        System.out.println("Enter your Name ");
        Name=sc.nextLine();
        System.out.println("Enter your Salary");
        Salary=sc.nextLine();

    }
    public void output(){
        System.out.println("My Name is "+Name+" And Salary is "+Salary);
    }

    @Override
    public void Input() {

    }

    @Override
    public void Output() {

    }
}
