package com.java.roject.string;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrintFun {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double me = (a*2)+(b*3)+(c*5);
        double mef = me/(2+3+5);
        DecimalFormat df = new DecimalFormat(".#");
        System.out.println("MEDIA = "+df.format(mef));

    }
}