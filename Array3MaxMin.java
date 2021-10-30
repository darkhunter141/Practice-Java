package com.java.roject.arraydemo;

public class Array3MaxMin {
    public static void main(String[] args) {
        int [] list = new int[5];
        list[0] =0;
        list[1] =56;
        list[2] =1;
        list[3] =2;
        list[4] =3;

        int temp = list[0];

        for (int i =0;i<5;i++) {

            if  (temp<list[i]) {

                temp = list[i];
            }
        }
        System.out.println(temp);


    }
}
