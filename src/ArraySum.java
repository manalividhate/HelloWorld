

public class ArraySum
{

    public ArraySum()
    {
    }

    public static void main(String args[])
    {
        int numbers[] = {
            1, 2, 3, 4, 5
        };
        int n = 0;
        for(int i = 0; i < numbers.length; i++)
            n += numbers[i];

        System.out.println((new StringBuilder()).append("Sum of all the elements of an array: ").append(n).toString());
    }
}
