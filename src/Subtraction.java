// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Subtraction.java

import java.io.PrintStream;

public class Subtraction
{

    public Subtraction()
    {
        a = 20;
        b = 30;
    }

    public int subtraction()
    {
        int c = a - b;
        System.out.println(c);
        return c;
    }

    public static void main(String args[])
    {
        Subtraction sub = new Subtraction();
        sub.subtraction();
    }

    int a;
    int b;
}
