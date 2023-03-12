package com.briegdelab;

public class AmstrongNumber {
    public static void main(String[] args) {

        int number = 1634;
        int num = number;
        int length = 0;

        while(num > 0){
            num = num / 10;
            length= length + 1;
        }

        System.out.println("Length of number is :: " + length);
        int n = number;
        int sum = 0;
        while (n > 0){
            int rem= n % 10;
            int product = 1;
            for (int i = 1; i <= length; i++){
                product = product * rem;
            }
            n = n / 10;
            sum = sum + product;
        }
        System.out.println("sum :: " + sum);

        if(number == sum){
            System.out.println(number + " is armstrong number");
        }else {
            System.out.println(number + " is not armstrong number");
        }

    }
}
