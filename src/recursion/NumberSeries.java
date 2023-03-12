package recursion;

public class NumberSeries {
    public static void main(String[] args) {
        int num = 1;
        print(1);
    }
    private static void print(int num){
        if(num <= 10){
            System.out.println(num);
            num++;
            print(num);
        }
    }
}
