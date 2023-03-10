package array_program;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"amar","ama","am"};

        System.out.println(findCommonPrefix(str));
    }

    private static String  findCommonPrefix(String[] str) {
        if(str.length == 0 || str == null){
            return "";
        }
        String lcs =str[0];

        for(int i = 1; i < str.length; i++){
            String currentWord = str[i];
            int j = 0;

            while (j < currentWord.length() && j < lcs.length() &&
            currentWord.charAt(j) == lcs.charAt(j)){
                j++;
            }

            if(j == 0)
                return "";

            lcs = currentWord.substring(0,j);
        }
        return lcs;
    }
}
