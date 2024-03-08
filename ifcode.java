import java.util.Scanner;

public class ifcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The percentage of Student = ");
        int x=sc.nextInt();
        
        if (x>=90) {
            System.out.println("The Grade is A");
        }
        else if(x>=80){
            System.out.println("The grade is B");
        }
        else if(x>=70){
        System.out.println("The Grade is C");
        }
else{
    System.out.println("The Grade is D");
}
sc.close();
    }

        
       
    }

