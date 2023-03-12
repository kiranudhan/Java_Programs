package com.briegdelab;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1000;

        if(year % 400== 0 || (year % 100 != 0 && year % 4 == 0)){
            System.out.println(year + " it is a leap year");
        }else {
            System.out.println(year + " it is not leap year");
        }

    }
}
