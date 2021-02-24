
import java.io.PrintStream;
import java.util.Scanner;

public class PractiseApp
{

    public PractiseApp()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input from user");
        System.out.println("Enter first number");
        int a = Integer.parseInt(sc.next());
        System.out.println("Enter second number");
        int b = Integer.parseInt(sc.next());
        int c = a;
        a = b;
        b = c;
        System.out.println("--After swap--");
        System.out.println((new StringBuilder()).append("First number = ").append(a).toString());
        System.out.println((new StringBuilder()).append("Second number = ").append(b).toString());
    }
}
