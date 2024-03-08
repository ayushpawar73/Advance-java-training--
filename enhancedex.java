import java.util.Scanner;

public class enhancedex {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int[] a=new int[10];
for(int j=0;j<10;j++){
        a[j]=inp.nextInt();
    }
        // This is for each loop
        // for(int i:a){
        //     System.out.println(i);
        // }
        // this is for loop
        for(int i=0;i<a.length;i++){
          
            if(i==5){
            break;
            }
            System.out.println(a[i]);
        }
        inp.close();
    }
}
