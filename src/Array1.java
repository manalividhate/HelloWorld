// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Array1.java

import java.io.PrintStream;

public class Array1
{

    public Array1()
    {
    }

    public static void main(String args[])
    {
        String fruits[] = {
            "mango", "apple", "banana"
        };
        System.out.println((new StringBuilder()).append("the first fruit is").append(fruits[0]).toString());
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
    }
}
