import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1 ; i<n;i++){
            if (i%2!=0) {
                System.out.println("The number is odd = " +i);
            }
        }
        for(int i=1 ; i<n;i++){
            if(i%2==0){
     System.out.println("The number is even = "+i);
            }
        }
        sc.close();

    }
}
