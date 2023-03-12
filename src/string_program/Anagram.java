package string_program;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "race" , s2 = "care";

        if(checkAnagram(s1,s2)){
            System.out.println("Strings are anagram");
        }else {
            System.out.println("Strings are not anagram");
        }

    }

    private static boolean checkAnagram(String s1, String s2){
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }
}
