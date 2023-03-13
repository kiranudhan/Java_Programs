package recursion;

public class ReverseString {

    public static void reverseStr(String s,int index ){
        if(index == 0){
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        reverseStr(s,index-1);
    }

    public static void main(String[] args) {

        String s = "java";//0123-3210
        System.out.println("Original string :: " + s);
        System.out.print("Reversed string :: ");
        reverseStr(s,s.length() - 1);
    }
}
