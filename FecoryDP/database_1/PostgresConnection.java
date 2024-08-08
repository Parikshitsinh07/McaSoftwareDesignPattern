import java.sql.*;

public class PostgresConnection implements Database {

    public Connection getConnect() {

        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "vikas2002");

        }catch (Exception e) {
            System.out.println(e);
        }
        return con;

    }
}

