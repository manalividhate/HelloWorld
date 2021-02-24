// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Bike4.java

import java.io.PrintStream;

public class Bike4 extends Bike1
{

    public Bike4()
    {
    }

    public void engine()
    {
        System.out.println("155cc");
    }

    public static void main(String args[])
    {
        Bike4 bike4 = new Bike4();
        bike4.companyname();
        bike4.bikecolour();
        bike4.engine();
    }
}
