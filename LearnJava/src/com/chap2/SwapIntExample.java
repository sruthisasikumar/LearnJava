package com.chap2;

public class SwapIntExample {
    public static void main (String args[]) {
        int a = 40;
        int b = 20;

        System.out.println("Before Swap");
        System.out.println("Value of a= "+a);
        System.out.println("Value of b= "+b);
        // using a 3rd variable
        int k;

        k = a;
        a = b;
        b = k;
        System.out.println("After Swap");
        System.out.println("Value of a= "+a);
        System.out.println("Value of b= "+b);

        // Not using 3rd variable
        int c = 10;
        int d = 30;

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("After Swap");
        System.out.println("Value of a= "+a);
        System.out.println("Value of b= "+b);
    }
 }
