import java.util.Scanner;

public class whileex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int y=input.nextInt();
      
        // while (y!=10) {
        //     System.out.println(y);
        //     y++;
        // }
        do{
System.out.println(y);
y++;
        }
            while (y!=10) ;
              
            
        
input.close();
    }
}

