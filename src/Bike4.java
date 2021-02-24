

public class Bike4 extends Bike1
{

    public Bike4()
    {
    }

    public void engine()
    {
        System.out.println("155cc");
    }

    public static void main(String args[])
    {
        Bike4 bike4 = new Bike4();
        bike4.companyname();
        bike4.bikecolour();
        bike4.engine();
    }
}
