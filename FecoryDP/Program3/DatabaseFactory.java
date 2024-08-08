public class DatabaseFactory
{
     public static MyDatabase getDatabaseFactory(int i)
	 {
	    switch(i)
		  {
		    case 1:{
						MyDatabase mysql = new Mysql();
						return mysql;
					}
			case 2:{
						MyDatabase postgres = new Postgres();
						return postgres;
					}
			case 0: System.exit(0);
			default: return null;
		  }
	   
	 }
}