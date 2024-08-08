import java.sql.*;
public interface MyDatabase{
	 /*String Driver = null;
	 String DBrul = null;
	 String User = null;
	 String Password = null;
	 
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;*/
	 
    public boolean getMyDatabeseConnection();
    public int execute(String Opretion,String Qurye);
    public void closeConnection();
}