// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CustomerApp.java

import java.io.PrintStream;
import java.util.*;

public class CustomerApp
{

    public CustomerApp()
    {
        customerDto = new CustomerDtoImp();
    }

    public static void main(String args[])
    {
        CustomerDto customerDto = new CustomerDtoImp();
        Scanner sc = new Scanner(System.in);
        int i;
        do
        {
            System.out.println("***Menu**");
            System.out.println("1. Get Customer");
            System.out.println("2. Add Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");
            System.out.println("*********");
            System.out.print("Enter number ");
            i = sc.nextInt();
            switch(i)
            {
            case 1: // '\001'
                System.out.println("Get Customer");
                CustomerApp customerApp = new CustomerApp();
                customerApp.displayCustomers();
                break;

            case 2: // '\002'
                System.out.println("Add customer");
                customerDto.addCustomer();
                break;

            case 3: // '\003'
                System.out.println("Update Customer");
                customerDto.updateCustomer();
                break;

            case 4: // '\004'
                System.out.println("Delete Customer");
                customerDto.deleteCustomer();
                break;

            case 5: // '\005'
                System.exit(1);
                // fall through

            default:
                System.out.println("enter correct number");
                break;
            }
        } while(i != 5);
    }

    public void displayCustomers()
    {
        List list = customerDto.getCustomers();
        Customer customer;
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println((new StringBuilder()).append("Customer id is:").append(customer.getId()).append("\t Customer name:").append(customer.getFirstname()).append("\t Customer last name:").append(customer.getLastname()).append("\t Customer mobileno:").append(customer.getMobileNo()).append("\t Customer Email :").append(customer.getEmail()).toString()))
            customer = (Customer)iterator.next();

    }

    CustomerDto customerDto;
}
