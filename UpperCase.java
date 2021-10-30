package com.java.roject;
import java.lang.*;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        boolean a;

        Scanner c = new Scanner(System.in);
        System.out.print("Enter Your Caracter : ");
        char e = c.next().charAt(0);
        a = Character.isUpperCase(e);
        if (a== true){
            System.out.println("Upper Case");
        }
        else {
            System.out.println("Lower Case");
        }



    }
}
