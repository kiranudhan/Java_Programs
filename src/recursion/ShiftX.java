package recursion;

public class ShiftX {

    public static void shiftX(String s,int index,int count,String newString){

        if( index == s.length()){

            for (int i = 0; i < count ; i++){
                newString = newString + 'x';
            }
            System.out.print(newString);
            return;
        }
        char curChar = s.charAt(index);

        if(curChar == 'x'){
            count++;
            shiftX(s,index+1,count,newString);
        }else {
            newString = newString + curChar;
            shiftX(s,index+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String s = "axbcxxd";
        shiftX(s,0,0,"");
    }
}
