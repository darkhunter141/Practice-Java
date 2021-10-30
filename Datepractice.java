package com.java.roject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datepractice {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a);
        DateFormat c = new SimpleDateFormat("dd/mm/yy");
        String my = c.format(a);
        System.out.println(my);
    }
}

