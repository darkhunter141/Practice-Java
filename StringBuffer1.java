package com.java.roject.string;

public class StringBuffer1 {

    public static void main(String[] args) {
         String Name1 = "Ashrafi";
         StringBuffer a = new StringBuffer(Name1);
        System.out.println(a.append(" Abir"));
       System.out.println(a.reverse());
        System.out.println(a.length());
        System.out.println(a.capacity());
    }
}
