package string_program;

public class LastWordCount {

    public static void count(String s){
        s = s.trim();
        int count = 0;
        char[] ch=s.toCharArray();
        System.out.println("Reversed last word :: ");
        for(int i = ch.length -1 ; i >= 0; i--){
            if(ch[i] != ' '){
                count++;
                System.out.print(ch[i]);
            }else {
                break;
            }
        }
        System.out.println();
        System.out.println("Count is : " +count);
    }
    public static void main(String[] args) {
        String s = "welcome to java";
        count(s);
    }
}
