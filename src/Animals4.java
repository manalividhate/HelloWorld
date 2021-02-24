// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Animals4.java


public class Animals4
{

    public Animals4()
    {
    }

    public static void main(String args[])
    {
        Animals1 myAnimal = new Animals1();
        Animals1 cat = new Cat();
        Animals1 dog = new Dog();
        myAnimal.animalSound();
        cat.animalSound();
        dog.animalSound();
    }
}
