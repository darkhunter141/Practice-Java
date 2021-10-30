package com.java.roject.arraydemo;

import java.util.Scanner;

public class Array2SumAvg {
    public static void main(String[] args) {

        double re =0;

        double [] num =  new double[5] ;
        double le = num.length;
        Scanner k = new Scanner(System.in);
        for (int i = 0;i<5;i++) {
            double fi = k.nextDouble();
            num [i] =fi;

            re = re+num[i];


        }
        System.out.println("Total : "+re);
        System.out.println("Avg : "+ (re/le));
    }
}
