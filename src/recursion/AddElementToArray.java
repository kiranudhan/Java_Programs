package recursion;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int size = 5;
        int[] array = new int[size];
        addElement(array, 0);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void addElement(int[] array, int index) {
         Scanner sc = new Scanner(System.in);
            if( index < array.length) {
                System.out.println("Enter element :: ");
                array[index] = sc.nextInt();
                index++;
                addElement(array, index);
            }
    }


}
