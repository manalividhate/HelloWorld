// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Series.java

import java.io.PrintStream;
import java.util.Scanner;

public class Series
{

    public Series()
    {
    }

    public void fseries()
    {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("Enter your number");
        j = sc.nextInt();
        for(int l = 1; l <= 10; l++)
        {
            k = i + j;
            i = j;
            j = k;
            System.out.println((new StringBuilder()).append("\t").append(i).toString());
        }

    }

    public static void main(String args[])
    {
        Series series = new Series();
        series.fseries();
    }

    int i;
    int j;
    int k;
}
