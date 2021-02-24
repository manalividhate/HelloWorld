
public class Addition
{

    public Addition()
    {
        a = 10;
        b = 20;
    }

    public int addition()
    {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void main(String args[])
    {
        Addition a1 = new Addition();
        a1.addition();
    }

    int a;
    int b;
}
