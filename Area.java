package com.java.roject;

import java.util.Scanner;

public class Area {
    public static void main (String [] args){

        Scanner a = new Scanner(System.in);
        System.out.print("Enter Base : ");
        double b = a.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.print("Enter Height : ");
        double d = c.nextDouble();

        double area = (b*d)/2;

        System.out.println("Your Solution : "+area);
        System.out.println("\nGood Bye Bro.");



    }
}
