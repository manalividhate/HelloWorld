

public class Subtraction
{

    public Subtraction()
    {
        a = 20;
        b = 30;
    }

    public int subtraction()
    {
        int c = a - b;
        System.out.println(c);
        return c;
    }

    public static void main(String args[])
    {
        Subtraction sub = new Subtraction();
        sub.subtraction();
    }

    int a;
    int b;
}
