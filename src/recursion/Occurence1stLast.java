package recursion;

public class Occurence1stLast {
    public static int first =-1;
    public static int last = -1;
    public static void check(String s,int index ){
        if(index == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(index) == 'a') {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        check(s,index + 1);
    }

    public static void main(String[] args) {
        String s="abaac";
        check(s,0);
    }
}
