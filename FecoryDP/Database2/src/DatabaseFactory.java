/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DatabaseFactory {
    
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
                        case 3:{
						MyDatabase SQLite = new SQLite();
						return SQLite;
					}
			case 0: System.exit(0);
			default: return null;
		  }
	   
	 }
    
}
