
import java.util.Scanner;

public class EvenOdd
{

    public EvenOdd()
    {
    }

    public void checkEvenOdd()
    {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if(i % 2 == 0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
    }

    public static void main(String args[])
    {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.checkEvenOdd();
    }

    int i;
}
