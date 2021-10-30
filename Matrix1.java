package com.java.roject.arraydemo;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        int [] [] a = new int[2][3];
        int [] [] b = new int[2][3];
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        for  (int row = 0;row<2;row++) {
            for (int col = 0;col<3;col++) {
                a [row][col] = in1.nextInt();
            }

        }
        for  (int row = 0;row<2;row++) {
            for (int col = 0;col<3;col++) {
                b [row][col] = in2.nextInt();
            }



        }

        for  (int row = 0;row<2;row++) {
            for (int col = 0;col<3;col++) {
                System.out.print(" "+a[row][col]);
                System.out.println();
                System.out.print(" "+a[row][col]);

            }

        }
    }
}
