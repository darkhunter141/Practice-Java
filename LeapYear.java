package com.java.roject;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int b = a.nextInt();
        if (b%4==0 &&  b%400==0||b%100!=0 ){
            System.out.println("Leap Year");
        }else {
            System.out.println("not leap year");
        }
    }
}
