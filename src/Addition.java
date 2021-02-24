// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Addition.java

import java.io.PrintStream;

public class Addition
{

    public Addition()
    {
        a = 10;
        b = 20;
    }

    public int addition()
    {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void main(String args[])
    {
        Addition a1 = new Addition();
        a1.addition();
    }

    int a;
    int b;
}
