package com.briegdelab;

public class Palindrome {
    public static void main(String[] args) {
        String s = "aba";
        String rev="";

        for(int i = s.length()-1; i >= 0; i--){
            rev=rev + s.charAt(i);
        }
        if(s.equalsIgnoreCase(rev)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
