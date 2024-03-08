import java.util.Scanner;
public class Returnex {
   public int fun(int a , int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("This is return example");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int x=sc.nextInt();
        System.out.println("Enter the second value");
        int y=sc.nextInt();
        Returnex n=new Returnex();
        int d=n.fun(x,y);
        System.out.println("The Sum Of two numbers is " +d);
       sc.close();  
    }

    
}
