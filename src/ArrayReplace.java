// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayReplace.java

import java.io.PrintStream;

public class ArrayReplace
{

    public ArrayReplace()
    {
    }

    public static void main(String args[])
    {
        String fruits[] = {
            "mango", "apple", "banana"
        };
        fruits[0] = "Strawberry";
        for(int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        String args1[] = fruits;
        int j = args1.length;
        for(int k = 0; k < j; k++)
        {
            String i = args1[k];
            System.out.println(i);
        }

        System.out.println((new StringBuilder()).append("length of array is").append(fruits.length).toString());
    }
}
