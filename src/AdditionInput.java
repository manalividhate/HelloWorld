// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AdditionInput.java

import java.io.PrintStream;
import java.util.Scanner;

public class AdditionInput
{

    public AdditionInput()
    {
        sc = new Scanner(System.in);
    }

    public int add()
    {
        System.out.println("enter value of a");
        a = Integer.parseInt(sc.next());
        System.out.println("Enter value of b ");
        b = Integer.parseInt(sc.next());
        c = a + b;
        return c;
    }

    public static void main(String args[])
    {
        AdditionInput a1 = new AdditionInput();
        System.out.println((new StringBuilder()).append("the addition is").append(a1.add()).toString());
    }

    int a;
    int b;
    int c;
    Scanner sc;
}
