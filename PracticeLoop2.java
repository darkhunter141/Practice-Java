package com.java.roject;

import java.util.Scanner;

public class PracticeLoop2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Your 1st Number : ");
        int num1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter Your 2nd Number : ");
        int num2 = b.nextInt();
        int sum = 0;

        for (int i = num1;i<=num2;i++) {
            if (i%2==0) {

                sum = sum+i;

            }

        }
        System.out.println(sum);
    }
}

