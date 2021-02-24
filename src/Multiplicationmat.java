// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Multiplicationmat.java

import java.io.PrintStream;
import java.util.Scanner;

public class Multiplicationmat
{

    public Multiplicationmat()
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
        System.out.println("matrix1 is ");
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
        System.out.println("matrix 2 is");
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

    public void multiplication()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                for(int k = 0; k < 2; k++)
                    c[i][j] += a[i][k] * b[k][j];

            }

        }

    }

    public void displaymultiplication()
    {
        System.out.println("multiplication of both matrices is:");
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
        Multiplicationmat multiplicationmat = new Multiplicationmat();
        multiplicationmat.create();
        multiplicationmat.displaymatrix1();
        multiplicationmat.displaymatrix2();
        multiplicationmat.multiplication();
        multiplicationmat.displaymultiplication();
    }

    int i;
    int j;
    int a[][];
    int b[][];
    int c[][];
}
