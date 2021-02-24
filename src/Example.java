// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Example.java

import java.io.PrintStream;
import java.util.Scanner;

public class Example
{

    public Example()
    {
    }

    public void create()
    {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        for(int i = rows; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

    }

    public static void main(String args[])
    {
        Example example = new Example();
        example.create();
    }

    int rows;
}
