package array_program;

public class SortArrayInAsc {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        //no of iteration
        for(int i = 0; i < a.length;i++){
            //for swapping
            for(int j = 0;j < a.length-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
