package com.java.roject;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        for (int l=2;l<10;l++) {
        int check = 0;
        for (int i = 2;i<l;i++){

            if (l%i==0){

                check++;
                break;

            }
        }

        if (check==0) {
            System.out.println("prime number" +l);
        }
        else  {
            System.out.println("not prime "+l);
    }
}}}
