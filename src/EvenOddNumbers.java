// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EvenOddNumbers.java

import java.io.PrintStream;

public class EvenOddNumbers
{

    public EvenOddNumbers()
    {
    }

    public static void main(String args[])
    {
        for(int i = 2; i <= 50; i += 2)
            System.out.print((new StringBuilder()).append("\t").append(i).toString());

    }
}
