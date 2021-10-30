package com.java.roject;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num2 = b.nextInt();

        int sum = 1;
        for (int i = 1;i<=num2;i++) {
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
