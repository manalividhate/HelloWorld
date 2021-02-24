// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EvenOdd.java

import java.io.PrintStream;
import java.util.Scanner;

public class EvenOdd
{

    public EvenOdd()
    {
    }

    public void checkEvenOdd()
    {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if(i % 2 == 0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
    }

    public static void main(String args[])
    {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.checkEvenOdd();
    }

    int i;
}
