package com.java.roject;

public class BinaryClass {
    public static void main(String[] args) {
        // binary to decimal
        String a = "1010101010";
        Integer b = Integer.parseInt(a,2);
        System.out.println("Re : "+b);
        // decimal to binary
        System.out.println();

        int c =10;
        String d = Integer.toBinaryString(c);
        System.out.println("Re 2 : "+d);


    }
}
