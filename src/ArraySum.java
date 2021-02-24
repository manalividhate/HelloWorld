// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArraySum.java

import java.io.PrintStream;

public class ArraySum
{

    public ArraySum()
    {
    }

    public static void main(String args[])
    {
        int numbers[] = {
            1, 2, 3, 4, 5
        };
        int n = 0;
        for(int i = 0; i < numbers.length; i++)
            n += numbers[i];

        System.out.println((new StringBuilder()).append("Sum of all the elements of an array: ").append(n).toString());
    }
}
