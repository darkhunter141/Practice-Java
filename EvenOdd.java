package com.java.roject;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner im = new Scanner(System.in);
        System.out.print("Enter Your Number : " );
        int a = im.nextInt();

        if (a%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
