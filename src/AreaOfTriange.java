import java.util.Scanner;
public class AreaOfTriange {
    double b,h,area;

            Scanner sc= new Scanner(System.in);
             public void calculation() {
                 System.out.println("here..we calculate Area of Triangle");
                 System.out.println("Enter width ");
                 b = sc.nextDouble();
                 System.out.println("Enter height:");
                 h = sc.nextDouble();
                 area = (b * h) / 2;
                 System.out.println("Area of Triangle is: " + area);
             }

            public static void main(String args[])
               {
                AreaOfTriange areaOfTriange=new AreaOfTriange();
                areaOfTriange.calculation();


               }
}

