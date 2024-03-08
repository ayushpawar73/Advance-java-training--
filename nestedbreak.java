
// Labelled break statement

public class nestedbreak {
    public static void main(String[] args) {
        int[]  a={32,87,3,589,12,1076,2000,8,622,127};
        int index=-1;
        int search=100;
        out:
        for(int i=0;i<=a.length;i++){
            for(int j=i+1;j<a.length;j++){
      System.out.print(" This is j");
            }
            System.out.println(a[i]);
            break out;
        }
    }
}
