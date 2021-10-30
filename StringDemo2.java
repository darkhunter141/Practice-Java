package com.java.roject.string;
import java.text.DecimalFormat;
import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        double n = 3.14159;
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double A = n*(R*R);
        DecimalFormat df = new DecimalFormat(".0000");
        System.out.print("A="+df.format(A));

    }
}
