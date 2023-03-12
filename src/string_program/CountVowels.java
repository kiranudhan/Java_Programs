package string_program;

public class CountVowels {

    public static void countVowels(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'I' || s.charAt(i) == 'E' || s.charAt(i) == 'O' ||
                    s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                count ++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String s = "radar";
        countVowels(s);
    }
}
