
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
