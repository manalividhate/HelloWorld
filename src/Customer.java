// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Customer.java


public class Customer
{

    public Customer()
    {
    }

    public Customer(String firstName, String lastName, int id, String mobileNo, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public void setId(int i)
    {
        id = i;
    }

    public int getId()
    {
        return id;
    }

    public void setFirstname(String fn)
    {
        firstName = fn;
    }

    public String getFirstname()
    {
        return firstName;
    }

    public void setLastname(String ln)
    {
        lastName = ln;
    }

    public String getLastname()
    {
        return lastName;
    }

    public String setMobileNo(String mobileNo)
    {
        this.mobileNo = mobileNo;
        return mobileNo;
    }

    public String getMobileNo()
    {
        return mobileNo;
    }

    public String setEmail(String e)
    {
        return email = e;
    }

    public String getEmail()
    {
        return email;
    }

    private String firstName;
    private String lastName;
    private int id;
    private String mobileNo;
    private String email;
}
