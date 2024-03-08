public class stringsearch {
    public static void main(String[] args) {
        int ct=0;
        String searchme="peter piper picked a"+"peck of pickled peppers";
        int len=searchme.length();
        for(int i=0;i<len;i++){
            if(searchme.charAt(i)=='p'){
            ct++;
            }
        }
        System.out.println("Numer of p in the string is " +ct);
    }
}
