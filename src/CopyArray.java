

public class CopyArray
{

    public CopyArray()
    {
    }

    public static void main(String args[])
    {
        int a[] = {
            1, 2, 3, 4, 5
        };
        int b[] = new int[a.length];
        for(int i = 0; i < a.length; i++)
            b[i] = a[i];

        System.out.println("Elements array of array a ");
        for(int i = 0; i < a.length; i++)
            System.out.print((new StringBuilder()).append(a[i]).append(" ").toString());

        System.out.println("\n Element of array b ");
        for(int i = 0; i < b.length; i++)
            System.out.print((new StringBuilder()).append(b[i]).append(" ").toString());

    }
}
