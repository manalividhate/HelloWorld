

public class Traversing
{

    public Traversing()
    {
    }

    public static void main(String args[])
    {
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println("\t before clone");
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        int b[] = (int[])a.clone();
        System.out.println("\t after clone");
        int ai[] = b;
        int k = ai.length;
        for(int l = 0; l < k; l++)
        {
            int j = ai[l];
            System.out.print(j);
        }

    }

    int sum;
}
