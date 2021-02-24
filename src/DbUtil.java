// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DbUtil.java

import java.io.PrintStream;
import java.sql.*;

public class DbUtil
{

    public DbUtil()
    {
    }

    Connection dbConnect()
    {
        String url = "jdbc:mariadb://localhost:3306/customerapp";
        String dbUsername = "root";
        String password = "root";
        String portNumber = "3306";
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(url, dbUsername, password);
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
