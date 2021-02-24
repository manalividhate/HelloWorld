

public class Multidimensional
{

    public Multidimensional()
    {
    }

    public static void main(String args[])
    {
        int mynumbers[][] = {
            {
                1, 2
            }, {
                3, 4
            }
        };
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
                System.out.println((new StringBuilder()).append("mynumbers[").append(i).append("][").append(j).append("] = ").append(mynumbers[i][j]).toString());

        }

    }
}
