package basic_program;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0){
            System.out.println(n+" is positive");
        } else if (n < 0) {
            System.out.println(n + " is negative");
        }else {
            System.out.println(n + " is zero");
        }
    }
}
