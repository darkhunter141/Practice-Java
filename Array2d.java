package com.java.roject.arraydemo;

public class Array2d {

    public static void main(String[] args) {
        int [][] list = new  int [2][3];
        list [0] [0] = 22;
        list [0] [1] = 44;
        list [0] [2] = 46;
        list [1] [0] = 28;
        list [1] [1] = 10;
        list [1] [2] = 12;
for (int row =0;row<2;row++){

    for (int col = 0;col<3;col++){

        System.out.print(" "+list[row][col]);

    }
    System.out.println();
}



    }
}
