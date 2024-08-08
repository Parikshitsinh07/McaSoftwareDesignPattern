/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Admin
 */
public class Postgres implements MyDatabase {
    private String Driver = "org.postgresql.Driver";
	private String DBurl = "jdbc:postgresql://localhost:5432/";
	private String User = "postgres";
	private String Password = "1234";
	Connection con = null;
	Statement st = null;
	static ResultSet rs = null;

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
	
	public Postgres()
	{
		
	}
	/*public Postgres(String User,String Password)
	{
	    this.User = User;
	    this.Password = Password;
	}
	public Postgres(String DBrul,String User,String Password)
	{
	    this.DBurl = DBrul;
	    this.User = User;
	    this.Password = Password;
	}
	public Postgres(String Driver,String DBrul,String User,String Password)
	{
		this.Driver = Driver ;
	    this.DBurl = DBrul;
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
