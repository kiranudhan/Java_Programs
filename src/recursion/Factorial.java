package recursion;

public class Factorial {
    //n!=5 * 4 * 3 * 2 * 1 = n * n!
    public static int calcFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fact_nm1 = calcFact(n-1)  ;
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        int num =calcFact(n);
        System.out.println("Factorial of "+ n + " is : " + num);
    }
}
