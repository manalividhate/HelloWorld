// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SimpleInterest.java

import java.io.PrintStream;

public class SimpleInterest
{

    public SimpleInterest()
    {
        p = 1000;
        r = 12;
        t = 2;
        total = 0.0F;
    }

    public float calculte()
    {
        float si = (p * r * t) / 100;
        return si;
    }

    public void totalamount()
    {
        total = calculte() + (float)p;
        System.out.println(total);
    }

    int p;
    int r;
    int t;
    float total;
}
