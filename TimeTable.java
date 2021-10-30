package com.java.roject;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num2 = b.nextInt();

        int sum = num2;
        for (int i = 1;i<=10;i++) {
           int  sum2 = sum*i;
            System.out.println(b+" i"+i +" = "+sum2);
        }
    }
}
