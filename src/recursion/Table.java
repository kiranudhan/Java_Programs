package recursion;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int num = sc.nextInt();
        int count = 1;
        printTable(num,1);
    }

    private static void printTable(int num,int count){
        if(count <= 10){
            System.out.println(num);
            num = num  * 2;
            count++;
            printTable(num,count);
        }

    }
}
