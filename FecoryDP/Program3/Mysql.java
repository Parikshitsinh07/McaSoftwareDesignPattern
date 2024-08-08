import java.sql.*;


public class Mysql implements MyDatabase{
	private String Driver = "com.mysql.jdbc.Driver" ;
	private String DBrul = "jdbc:mysql://localhost:3306/parikshit_20" ;
	private String User = "root";
	private String Password = "";
	Connection con = null;
	Statement st = null;
	static ResultSet rs = null;

	public Mysql()
	{
		
	}
	public Mysql(String User,String Password)
	{
	    this.User = User;
	    this.Password = Password;
	}
	public Mysql(String DBrul,String User,String Password)
	{
	    this.DBrul = DBrul;
	    this.User = User;
	    this.Password = Password;
	}
	public Mysql(String Driver,String DBrul,String User,String Password)
	{
		this.Driver = Driver ;
	    this.DBrul = DBrul;
	    this.User = User;
	    this.Password = Password;
	}
	public boolean getMyDatabeseConnection()
	{
		try
		{
			Class.forName(Driver);
			con = DriverManager.getConnection(DBrul,User,Password);
			st = con.createStatement();
			if(con != null && st != null)
			{
				return true;
			}
		
		}
		catch(ClassNotFoundException ce)
		{
			//ce.printStackTrece();
			System.out.println("ClassNotFoundException !");
		}
		catch(SQLException se)
		{
			System.out.println("SQLException !");
			//se.printStackTrece();
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