package string_program;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string :: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//java
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Original String :: " + s);
        System.out.println("Reversed String :: " + rev);




    }
}
