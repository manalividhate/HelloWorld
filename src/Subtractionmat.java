// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Subtractionmat.java

import java.io.PrintStream;
import java.util.Scanner;

public class Subtractionmat
{

    public Subtractionmat()
    {
        a = new int[2][2];
        b = new int[2][2];
        c = new int[2][2];
    }

    public void create()
    {
        System.out.println("Enter all elements");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print((new StringBuilder()).append("[").append(i).append("][").append(j).append("]=").toString());
                a[i][j] = sc.nextInt();
            }

        }

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print((new StringBuilder()).append("[").append(i).append("][").append(j).append("]=").toString());
                b[i][j] = sc.nextInt();
            }

        }

    }

    public void displaymatrix1()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }

            System.out.println("\n");
        }

    }

    public void displaymatrix2()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(b[i][j]);
                System.out.print("\t");
            }

            System.out.println("\n");
        }

    }

    public void subtraction()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
                c[i][j] = a[i][j] - b[i][j];

        }

    }

    public void displaysubtraction()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(c[i][j]);
                System.out.print("\t");
            }

            System.out.println("\n");
        }

    }

    public static void main(String args[])
    {
        Subtractionmat subtractionmat = new Subtractionmat();
        subtractionmat.create();
        subtractionmat.displaymatrix1();
        subtractionmat.displaymatrix2();
        subtractionmat.subtraction();
        subtractionmat.displaysubtraction();
    }

    int i;
    int j;
    int a[][];
    int b[][];
    int c[][];
}
