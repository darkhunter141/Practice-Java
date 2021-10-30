package com.java.roject;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        int  sum = 0;
        int temp = num;
        while (temp!=0) {

            int k = temp%10;

            sum = sum+(k*k*k);

            temp =temp/10;






        }
        System.out.println(sum);


    }
}
