package array_program;

public class Sort0sAnd1s {
    public static void main(String[] args) {
        int[] a = {0,1,0,1,1,0,0};
        System.out.println("Original array :: " );
        for (int k= 0; k < a.length;k++){
            System.out.print(a[k] + " ");
        }

        int i = 0;
        int j = a.length-1;

        while( j > i){
            if(a[i] == 0 && a[j] == 1){
                i++;
                j--;
            } else if (a[i] == 0) {
                i++;
            }else if(a[i] == 1 && a[j] == 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println();
        System.out.println("Sorted array :: ");
        for (int k = 0; k < a.length; k++){
            System.out.print(a[k] + " ");
        }
    }
}
