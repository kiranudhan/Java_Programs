package array_program;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,4,2,8};

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
