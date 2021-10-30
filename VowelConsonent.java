package com.java.roject;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        char vcr =vc.next().charAt(0);
        if (vcr =='a' || vcr =='e' || vcr =='i'|| vcr =='o'|| vcr =='u'){

            System.out.println("Vowel");

        }
        else {
            System.out.println("Consonant");
        }
    }
}
