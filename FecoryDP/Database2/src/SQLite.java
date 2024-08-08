/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Admin
 */
public class SQLite implements MyDatabase {
    private String Driver = "org.sqlite.JDBC";
	private String DBurl = "jdbc:sqlite://";
	private String User = "root";
	private String Password = "";
	Connection con = null;
	Statement st = null;
	static ResultSet rs = null;
	
	public SQLite()
	{
		
	}
	public SQLite(String User,String Password)
	{
	    this.User = User;
	    this.Password = Password;
	}
	public SQLite(String DBurl,String User,String Password)
	{
	    this.DBurl = DBurl;
	    this.User = User;
	    this.Password = Password;
	}
	public SQLite(String Driver,String DBurl,String User,String Password)
	{
		this.Driver = Driver ;
	    this.DBurl = DBurl;
	    this.User = User;
	    this.Password = Password;
	}

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public String getDBurl() {
        return DBurl;
    }

    public void setDBurl(String DBurl) {
        this.DBurl =  this.DBurl + DBurl;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
//        this.Password = Password;
    }
	
		
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
			ce.printStackTrace();
//			System.out.println("ClassNotFoundException !");
		}
		catch(SQLException se)
		{
//			System.out.println("SQLException !");
			se.printStackTrace();
		}
			return false;
	}
	
	public int execute(String Opretion,String Qurye)
	{
		int c = 0;
		if(getMyDatabeseConnection())
		{
			try{
				switch(Opretion)
				{
					case "INSERT":
					case "UPDATE":
					case "DELETE": c = st.executeUpdate(Qurye);
						break;
					case "SELECT": rs = st.executeQuery(Qurye);
						break;
					default :System.out.println("Opretion is invalid !");
						break;
				}
				if(rs != null)
				{
					return -1;
				}
				else
				{
					return c;
				}
			}
			catch(SQLException se){
				System.out.println("SQLException 2!");
			}
		}
		return c;
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
                System.out.println("SQL Exception : " + e.getMessage());
            }
	}
    
}
