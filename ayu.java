
public class ayu {
    static int c =45;
     void fun(){
        int b=5;
        System.out.println(c+ " "+b);
        c=c+1;
        b=b+1;
     }

    public static void main(String[] args) {
       ayu o=new ayu();
       o.fun();
       o.fun();
       o.fun();
       o.fun();
    }

}
