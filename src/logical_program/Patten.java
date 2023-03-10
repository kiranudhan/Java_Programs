package logical_program;

public class Patten {
//    0
//    1 0
//    0 1 0
//    1 0 1 0
//    0 1 0 1 0 //add i+j check if is even then print 0 else 1
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
