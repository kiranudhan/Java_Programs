package array_program;

public class AdditionOfArrayElement {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of array element is :: " + sum);
    }
}
