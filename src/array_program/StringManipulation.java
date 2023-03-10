package array_program;

public class StringManipulation {
    public static void main(String[] args) {
        //Output:My favrt colors are pink, yellow, red and black.
        String[] array = {"pink","yellow","red","black"};
        System.out.print("My favrt colors are ");
        for(int i = 0; i < array.length; i++){
            if( i != array.length-1){
                if( i == array.length - 2){
                    System.out.print(array[i] + " and ");
                }else {
                    System.out.print(array[i] + ", ");
                }
            }
            else {
                System.out.print(array[i] + ".");
            }
        }
    }
}
