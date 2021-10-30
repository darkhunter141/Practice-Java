package com.java.roject;

import java.util.Scanner;

public class CheckingMAXMIN {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Your 1st Number : ");
        int b = a.nextInt();
        Scanner e = new Scanner(System.in);
        System.out.print("Enter Your 1st Number : ");
        int f = a.nextInt();
        if (b>f){
            System.out.println("Max Number is : " +b);
            System.out.println("Min Number is : " +f);

        }
        else {
            System.out.println("Max Number is : " +f);
            System.out.println("Min Number is : " +b);
        }
    }
}
