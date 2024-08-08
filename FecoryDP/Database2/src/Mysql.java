/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Admin
 */
public class Mysql implements MyDatabase {
    private String Driver = "com.mysql.jdbc.Driver" ;
	private String DBurl = "jdbc:mysql://localhost:3306/" ;
	private String User = "root";
	private String Password = "";
	Connection con = null;
	Statement st = null;
	static ResultSet rs = null;

    public String getDriver() {
        return Driver;
    }

    public String getDBurl() {
        return DBurl;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public void setDBurl(String DBurl) {
        this.DBurl = this.DBurl + DBurl;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

	public Mysql()
	{
		
	}
	/*public Mysql(String User,String Password)
	{
	    this.User = User;
	    this.Password = Password;
	}
	public Mysql(String DBurl,String User,String Password)
	{
	    this.DBurl = this.DBurl + DBurl;
	    this.User = User;
	    this.Password = Password;
	}
	public Mysql(String Driver,String DBrul,String User,String Password)
	{
		this.Driver = Driver ;
	    this.DBurl = DBurl;
	    this.User = User;
	    this.Password = Password;
	}*/
	public boolean getMyDatabeseConnection()
	{
		try
		{
			Class.forName(Driver);
			con = DriverManager.getConnection(DBurl,User,Password);
			st = con.createStatement();
			if(con != null && st != null)
			{
				return true;
			}
		
		}
		catch(ClassNotFoundException ce)
		{
			//ce.printStackTrece();
//			System.out.println("ClassNotFoundException !");
                    ce.printStackTrace();
		}
		catch(SQLException se)
		{
//			System.out.println("SQLException !");
			//se.printStackTrece();
                    se.printStackTrace();
		}
			return false;
	}
	
	public int execute(String Opretion,String Qurye)
	{
            int c = 0;
            try{
                c = st.executeUpdate(Qurye);				
            }			
            catch(SQLException se)
            {
                se.printStackTrace();
            }
            return c;
	}
        public ResultSet execute(String Qurye){
            try{
                rs = st.executeQuery(Qurye);
            }
            catch(SQLException se){
                se.printStackTrace();
            }
            return rs;
        }
    public void closeConnection()
	{
		try {
				if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
//                System.out.println("SQL Exception : " + e.getMessage());
            }
	}
    
}
