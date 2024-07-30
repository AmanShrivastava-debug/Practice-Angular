import java.sql.*;
import java.sql.DriverManager;

public class DatabaseConnection
{
    public static final String URL="jdbc:musql://localhost:3308/patientRecord";
    public static final String USERNAME="root";
    public static final String PASSWORD="root";
    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}