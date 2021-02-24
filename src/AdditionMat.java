
import java.util.Scanner;

public class AdditionMat
{

    public AdditionMat()
    {
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = in.nextInt();
        System.out.println("Enter the number columns");
        int col = in.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];
        System.out.println("Enter the elements of matrix1");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                mat1[i][j] = in.nextInt();

            System.out.println();
        }

        System.out.println("Enter the elements of matrix2");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                mat2[i][j] = in.nextInt();

            System.out.println();
        }

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                res[i][j] = mat1[i][j] + mat2[i][j];

        }

        System.out.println("Sum of matrices:-");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                System.out.print((new StringBuilder()).append(res[i][j]).append("\t").toString());

            System.out.println();
        }

    }
}
