import java.sql.*;

public class MySQLConnection implements Database {

    public Connection getConnect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "vikas2002");
        }catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}