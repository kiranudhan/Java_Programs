package com.briegdelab;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int nextNum;
        System.out.println("Fibonacci series is :: ");
        System.out.print(num1 + " " + num2 );
        for (int i = 2; i < 10; i++){
            nextNum = num1 + num2;
            num1=num2;
            num2=nextNum;
            System.out.print(" " + nextNum);
        }
    }
}
