package basic_program;

public class Sum {
    public static void main(String[] args) {
        int num1 = 12,num2=15;
        int sum = 0;

        for(int i = num1; i <= num2; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
