package com.java.roject;

public class BreakContinue {
    public static void main(String[] args) {
        // break

        for (int i= 1;i <=100;i++) {

            if (i ==10){
                break;
            }
            else {
                System.out.println(i);
            }


        }

        // continue
        for (int v= 1;v <=100;v++) {

            if (v==10){
                continue;
            }
            System.out.println(v);


        }


    }
}
