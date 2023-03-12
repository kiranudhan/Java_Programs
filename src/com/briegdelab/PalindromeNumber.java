package com.briegdelab;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0, rem;

        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(temp == rev){
            System.out.println(temp + " is palindrome");
        }else {
            System.out.println(temp + " is not palindrome");
        }
    }
}
