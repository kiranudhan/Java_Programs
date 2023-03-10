package array_program;

public class CountZeroAndOne {
    public static void main(String[] args) {
        String[] strings = {"1010","1010","1111","0000"};
        int count1 = 0, count0 = 0;
        for (int i = 0; i < strings.length; i++){
            String str = strings[i];
            for (int j = 0; j < str.length() ; j++){
                if(str.charAt(i) == '0'){
                    count0++;
                }else if(str.charAt(i) == '1') {
                    count1++;
                }
            }
        }
        System.out.println("Count of Zero :: " + count0);
        System.out.println("Count of One :: " + count1);
    }
}
