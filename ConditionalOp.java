package com.java.roject;

import java.util.Scanner;

public class ConditionalOp {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int b = a.nextInt();
        System.out.print("Enter Your Number : ");
        int e = a.nextInt();
        int lage = Math.max(b, e);
        System.out.println(lage);
    }
}
