public class search {
    public static void main(String[] args) {
        // int[] a=new int[20];
        int[] a={32,87,3,589,12,1076,2000,8,622,127};
        // for(int i=0;i<=a.length;i++){
        //     if(a[i]==12){
        //         System.out.println(i);
        //     }
        // }

        // using for each
        int index=0,ch=0;
        for(int i:a){
             if (i==12) {
                System.out.println("Element Found at " +index);
                ch=1;
                break;
             }
             index++;
        }
if(ch==0){
    System.out.println("Element not fount");
}
    }
}
