package org.example;

public class Main {
    public static void main(String[] args)
    {
        int a=2;
        int b=3;
        System.out.println("before swapping"+a+" "+b);
        int c=a;
        a=b;
        b=c;

        System.out.println("After Swapping"+a+" "+b);
    }
}