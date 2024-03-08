public class woutloopnum {
    void num(int i){
        System.out.println(i);
        i++;
        if (i<=10) {
            num(i);
        }
    }
    public static void main(String[] args) {
        int i=1;
        woutloopnum n=new woutloopnum();
        n.num(i);
    }
}
