import java.sql.*;

public class SQLiteConnection implements Database {
	
	public Connection getConnect() {
		Connection con=null;
		try
		{
			Class.forName("org.sqlite.JDBC");
			String url="jdbc:sqlite:D:/MCA_212308037_ll/software_design_pattern/database_1/student.db";
			con=DriverManager.getConnection(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
		
	}			
}

