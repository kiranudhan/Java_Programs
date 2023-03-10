package array_program;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        int[] a = {1,2,1,2,1};
        int[] frequency = new int[a.length];

        for(int i = 0; i < a.length; i++){
            int count = 1;
            if(a[i] != -1) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = -1;
                    }
                }
            }
            frequency[i] = count;
        }

        for (int i = 0 ; i < a.length; i++){
            if(a[i] != -1) {
                System.out.println("Frequency of " + a[i] + " is " + frequency[i]);
            }
        }

    }
}
