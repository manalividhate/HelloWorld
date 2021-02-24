
import java.util.Scanner;

public class MatrixDemo
{

    public MatrixDemo()
    {
    }

    public static void main(String args[])
    {
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row for the array  ");
        int row = scan.nextInt();
        System.out.print("Enter column for the array ");
        int col = scan.nextInt();
        System.out.println((new StringBuilder()).append("Enter ").append(row * col).append(" Array Elements : ").toString());
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                arr[i][j] = scan.nextInt();

        }

        System.out.print("The Array is :\n");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                System.out.print((new StringBuilder()).append(arr[i][j]).append("  ").toString());

            System.out.println();
        }

    }
}
