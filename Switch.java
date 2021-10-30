package com.java.roject;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int b = a.nextInt();

        switch (b) {
            case 1 -> System.out.println("Number : 1");
            case 2 -> System.out.println("Number : 2");
            case 3 -> System.out.println("Number : 3");
            case 4 -> System.out.println("Number : 4");
            case 5 -> System.out.println("Number : 5");
            case 6 -> System.out.println("Number : 6");
            case 7 -> System.out.println("Number : 7");
            case 8 -> System.out.println("Number : 8");
            case 9 -> System.out.println("Number : 9");
            case 10 -> System.out.println("Number : 10");
        }
    }
}
