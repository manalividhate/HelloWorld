

public class EvenOddNumbers
{

    public EvenOddNumbers()
    {
    }

    public static void main(String args[])
    {
        for(int i = 2; i <= 50; i += 2)
            System.out.print((new StringBuilder()).append("\t").append(i).toString());

    }
}
