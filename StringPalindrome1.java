package com.java.roject.string;

import java.util.Scanner;

public class StringPalindrome1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter your Word : ");
        String inp = a.next();
        StringBuffer sb = new StringBuffer(inp);
        String k = sb.reverse().toString();
         if (inp.equals(k)) {

             System.out.println("P");
         }
         else  {
             System.out.println("not");
         }


    }
}
