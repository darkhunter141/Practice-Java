package com.java.roject.string;

public class Primitive1 {
    public static void main(String[] args) {
        int a = 30;
        String b = Integer.toString(a);
        System.out.println(b.getClass().getSimpleName());
        int c = Integer.parseInt(b);

        System.out.println(c);
    }
}
