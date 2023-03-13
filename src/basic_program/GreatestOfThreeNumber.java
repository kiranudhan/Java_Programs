package basic_program;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        int num1 = 50,num2 =40, num3 = 30;

//        if(num1 > num2){
//            if(num1 > num3){
//                System.out.println(num1 + " is greater");
//            }else {
//                System.out.println(num3 + " is greater");
//            }
//        }else{
//            if(num2 > num3) {
//                System.out.println(num2 + " is greater");
//            }else {
//                System.out.println(num3 + " is greater");
//            }
//        }


        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greater");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater");
        }else {
            System.out.println(num3 + " is greater");
        }
    }
}
