// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserInput.java

import java.io.PrintStream;
import java.util.Scanner;

public class UserInput
{

    public UserInput()
    {
    }

    public void printEvenOdd()
    {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        for(int j = 1; j <= 50; j++)
            if(i % 2 == 0)
            {
                i = i + 2;
                System.out.print((new StringBuilder()).append("\t").append(i).toString());
            } else
            {
                i = i + 2;
                System.out.print((new StringBuilder()).append("\t ").append(i).toString());
            }

    }

    public static void main(String args[])
    {
        UserInput userInput = new UserInput();
        userInput.printEvenOdd();
    }

    int i;
}
