package com.java.roject;

import java.util.Scanner;

public class CircleArea {

    public static  void main (String [] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Enter  Your Value : ");
        double b = a.nextDouble();
        double area = 3.1416*(b*b);
        System.out.println("Solution : "+area);
    }
}
