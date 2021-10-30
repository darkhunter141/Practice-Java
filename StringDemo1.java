package com.java.roject.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String a = "Abir";
        String b = "Abir";
        boolean r = a.equals(b);
        System.out.println(r);
        String e = "Abir abir";
        String f = "abir";
        boolean re =e.equalsIgnoreCase(f);
        boolean re1 = e.contains(f);
        boolean r2 = e.isEmpty();
        System.out.println(re);
        System.out.println(e.length());
        System.out.println(re1);
        System.out.println(r2);

    }
}
