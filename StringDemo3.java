package com.java.roject.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String A = "Ashrafi Abir";
        String s = A.replace("Abir","Khandaker");
        System.out.println(s);
        String [] li = A.split(" ");
        for (String x : li) {

            System.out.println(x);
        }

    }
}
