
import java.util.Scanner;

public class DemoInput
{

    public DemoInput()
    {
        sc = new Scanner(System.in);
    }

    public void setName(String str)
    {
        name = str;
    }

    public String getName()
    {
        return name;
    }

    public void setId(int id)
    {
        id = id;
    }

    public int getId()
    {
        return id;
    }

    public void displayInfo()
    {
        System.out.println("enter the name");
        setName(sc.next());
        System.out.println("Enter your id: ");
        setId(Integer.parseInt(sc.next()));
    }

    public static void main(String args[])
    {
        DemoInput di = new DemoInput();
        di.displayInfo();
        System.out.println((new StringBuilder()).append("You entered ").append(di.getName()).toString());
        System.out.println((new StringBuilder()).append("You entered ").append(di.getId()).toString());
    }

    private String name;
    private int id;
    Scanner sc;
}
