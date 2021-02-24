
import java.sql.*;
import java.util.*;

public class CustomerDtoImp
    implements CustomerDto
{

    public CustomerDtoImp()
    {
        dbUtil = new DbUtil();
    }

    public void updateCustomerField(String field, String value, int id)
    {
        try
        {
            Connection conn = dbUtil.dbConnect();
            String query = (new StringBuilder()).append("UPDATE customer SET ").append(field).append(" = ? WHERE ID=?").toString();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, value);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
        catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public void deleteCustomerById(int id)
    {
        try
        {
            Connection conn = dbUtil.dbConnect();
            if(getCustomerById(id) != null)
            {
                String query = "delete from customer WHERE ID=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ps.execute();
            } else
            {
                System.out.println("No Data found");
            }
        }
        catch(Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public Customer getCustomerById(int id)
        throws SQLException
    {
        Connection conn = dbUtil.dbConnect();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM CUSTOMER WHERE ID=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            Customer customer = new Customer();
            customer.setFirstname(rs.getString("FIRST_NAME"));
            return customer;
        } else
        {
            return null;
        }
    }

    public List getCustomers()
    {
        List customers = new ArrayList();
        try
        {
            Connection conn = dbUtil.dbConnect();
            String query = "Select * from customer";
            PreparedStatement ps = conn.prepareStatement(query);
            Customer customer;
            for(ResultSet resultSet = ps.executeQuery(); resultSet.next(); customers.add(customer))
            {
                customer = new Customer();
                customer.setId(resultSet.getInt("ID"));
                customer.setFirstname(resultSet.getString("FIRST_NAME"));
                customer.setLastname(resultSet.getString("LAST_NAME"));
                customer.setMobileNo(resultSet.getString("MOBILE_NO"));
                customer.setEmail(resultSet.getString("EMAIL"));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return customers;
    }

    public boolean isValidEmail(String email)
    {
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);
        for(int j = email.indexOf("@"); j < 1;)
            if(j < 1)
            {
                String domain[] = email.split("@");
                String as[] = domain;
                int i = as.length;
                int i1 = 0;
                while(i1 < i) 
                {
                    String a = as[i1];
                    if(a.contains("."))
                    {
                        int k = email.indexOf('.');
                        if(k > j)
                        {
                            int l = email.lastIndexOf("a");
                            if(k != l)
                            {
                                customer.setEmail(sc.next(email));
                                System.out.println("valid Email!!!");
                            } else
                            {
                                System.out.println("Please enter valid Email");
                                email = sc.next();
                            }
                        } else
                        {
                            System.out.println("Please enter valid Email");
                            email = sc.next();
                        }
                    } else
                    {
                        System.out.println("Please enter valid Email");
                        email = sc.next();
                    }
                    i1++;
                }
            } else
            {
                System.out.println("please enter valid Email");
                email = sc.next();
            }

        return false;
    }

    public void addCustomer()
    {
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theNew Customer First Name:");
        customer.setFirstname(sc.next());
        System.out.println("Enter theNew Customer Last Name:");
        customer.setLastname(sc.next());
        System.out.println("Enter customer mobile number");
        for(String phone = customer.setMobileNo(sc.next()); phone.length() != 10;)
            if(phone.length() != 10)
            {
                System.out.print("The phone number is invalid");
                System.out.print("\n Enter the valid phone number: ");
                phone = sc.next();
            } else
            {
                System.out.println("Given phone number is valid");
                customer.setMobileNo(sc.next(phone));
            }

        System.out.println(" Enter the Customer Email:");
        String email = customer.setEmail(sc.next());
        do
        {
            boolean State = isValidEmail(email);
            if(State)
            {
                customer.setEmail(email);
                break;
            }
            System.out.println("please enter valid Email:");
        } while(true);
        String sql = "INSERT INTO customer(first_name,last_name,mobile_No,email) VALUES(?,?,?,?)";
        try
        {
            Connection conn = dbUtil.dbConnect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, customer.getFirstname());
            pstmt.setString(2, customer.getLastname());
            pstmt.setString(3, customer.getMobileNo());
            pstmt.setString(4, customer.getEmail());
            int i = pstmt.executeUpdate();
            if(i != 0)
                System.out.println("added");
            else
                System.out.println("failed to add");
            conn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    public void updateCustomer()
    {
        Customer customer = new Customer();
        System.out.println("Enter the Customer Id:");
        Scanner sc = new Scanner(System.in);
        customer.setId(sc.nextInt());
        try
        {
            Connection conn = dbUtil.dbConnect();
            PreparedStatement pstmt = conn.prepareStatement("Select * from customer where id=?");
            pstmt.setInt(1, customer.getId());
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                customer.setFirstname(rs.getString("FIRST_NAME"));
                customer.setLastname(rs.getString("LAST_NAME"));
                customer.setMobileNo(rs.getString("MOBILE_NO"));
                customer.setEmail(rs.getString("EMAIL"));
                int choice;
                do
                {
                    System.out.println("***Menu**");
                    System.out.println((new StringBuilder()).append("1. First Name: ").append(customer.getFirstname()).toString());
                    System.out.println((new StringBuilder()).append("2. Last Name:").append(customer.getLastname()).toString());
                    System.out.println((new StringBuilder()).append("3. Mobile Number:").append(customer.getMobileNo()).toString());
                    System.out.println((new StringBuilder()).append("4. Email:").append(customer.getEmail()).toString());
                    System.out.println("5. Exit");
                    System.out.println("*********");
                    System.out.print("Enter number ");
                    choice = sc.nextInt();
                    switch(choice)
                    {
                    case 1: // '\001'
                        System.out.println("Enter the New First Name");
                        customer.setFirstname(sc.next());
                        updateCustomerField("FIRST_NAME", customer.getFirstname(), customer.getId());
                        break;

                    case 2: // '\002'
                        System.out.println("Enter the New Last Name");
                        customer.setLastname(sc.next());
                        updateCustomerField("LAST_NAME", customer.getLastname(), customer.getId());
                        break;

                    case 3: // '\003'
                        System.out.println("Enter the New Mobile Number");
                        customer.setMobileNo(sc.next());
                        updateCustomerField("MOBILE_NO", customer.getMobileNo(), customer.getId());
                        break;

                    case 4: // '\004'
                        System.out.println("Enter the New Email Address");
                        customer.setEmail(sc.next());
                        updateCustomerField("EMAIL", customer.getEmail(), customer.getId());
                        break;

                    case 5: // '\005'
                        System.out.println();
                        break;
                    }
                } while(choice != 5);
            } else
            {
                System.out.println("No data Found");
            }
        }
        catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public void deleteCustomer()
    {
        Customer customer = new Customer();
        System.out.println("Enter the Customer Id:");
        Scanner sc = new Scanner(System.in);
        customer.setId(sc.nextInt());
        deleteCustomerById(customer.getId());
    }

    DbUtil dbUtil;
}
