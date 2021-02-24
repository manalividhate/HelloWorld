

public class Student
{

    public Student()
    {
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public void setRollNo(int r)
    {
        rollNo = r;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public static void main(String args[])
    {
        Student sn = new Student();
        sn.setName("abc");
        sn.setRollNo(123);
        Student sn1 = new Student();
        sn1.setName("def");
        sn1.setRollNo(456);
        Student sn2 = new Student();
        sn2.setName("ghi");
        sn2.setRollNo(789);
        Student sn3 = new Student();
        sn3.setName("jkl");
        sn3.setRollNo(1011);
        System.out.println(sn.getName());
        System.out.println(sn.getRollNo());
        System.out.println(sn1.getName());
        System.out.println(sn1.getRollNo());
        System.out.println(sn2.getName());
        System.out.println(sn2.getRollNo());
        System.out.println(sn3.getName());
        System.out.println(sn3.getRollNo());
    }

    private String name;
    private int rollNo;
}
