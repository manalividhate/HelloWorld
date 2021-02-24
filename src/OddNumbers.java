// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OddNumbers.java

import java.io.PrintStream;

public class OddNumbers
{

    public OddNumbers()
    {
    }

    public static void main(String args[])
    {
        for(int i = 1; i <= 20; i++)
            if(i % 2 != 0)
                System.out.println((new StringBuilder()).append("odd numbers is").append(i).toString());

    }
}
