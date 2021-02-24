
import java.util.Scanner;

public class TwoDimensional
{

    public TwoDimensional()
    {
        row = 2;
        col = 2;
        mat = new int[2][2];
        matr = new int[2][2];
        matricse = new int[2][2];
    }

    public void create()
    {
        System.out.println("Enter all elements");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print((new StringBuilder()).append("[").append(i).append("][").append(j).append("]=").toString());
                mat[i][j] = sc.nextInt();
            }

        }

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print((new StringBuilder()).append("[").append(i).append("][").append(j).append("]=").toString());
                matr[i][j] = sc.nextInt();
            }

        }

    }

    public void displayMatrix()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }

            System.out.println("\n");
        }

    }

    public void displayMatrix1()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(matr[i][j]);
                System.out.print("\t");
            }

            System.out.println("\n");
        }

    }

    public void addition()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
                matricse[i][j] = mat[i][j] + matr[i][j];

        }

    }

    public void displayaddition()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(matricse[i][j]);
                System.out.print("\t");
            }

            System.out.println("\n");
        }

    }

    public static void main(String args[])
    {
        TwoDimensional twoDimensional = new TwoDimensional();
        twoDimensional.create();
        twoDimensional.displayMatrix();
        twoDimensional.displayMatrix1();
        twoDimensional.addition();
        twoDimensional.displayaddition();
    }

    int i;
    int j;
    int mynumbers;
    int row;
    int col;
    int mat[][];
    int matr[][];
    int matricse[][];
}
