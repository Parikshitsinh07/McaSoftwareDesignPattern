/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class MainClient {
    public static void  main (String [] args){
		Scanner sc=new Scanner(System.in);
		MyDatabase Database = null ;
                String DBurl,User,Password;
                //parikshit_20,Admin,Parikshit@1234
                //Parikshit01,postgres,1234
                //D:/java/Gof/FecoryDP/Database2/src/Parikshit02.db,root,""
	   int opt = 0;
           int set = 0;
           do{
		System.out.println("========================");
		System.out.println("    DATABASE ");
		System.out.println("========================");
		System.out.print("1.Mysql Database\n2.Postgres Database\n3.SQLite Database\n0.Exit\n");
		System.out.println("Select Your Database :");
		opt = sc.nextInt();
                        
		Database = DatabaseFactory.getDatabaseFactory(opt);
                    if(Database != null){
                        // Database.setDriver();
                        System.out.println("Enter Your Database Name :");
                        DBurl = sc.next();
                        Database.setDBurl(DBurl);
                        System.out.print("Enter Your User Name :");
                        User = sc.next();
                        Database.setUser(User);
                        System.out.print("Enter Your User Password :");
                        Password = sc.next();
                        Database.setPassword(Password); 
                        }
			if(Database.getMyDatabeseConnection())
			{
				System.out.println("Database Connection Success !!");
			}
			else
			{
				System.out.println("Database Connection Faild !!");
			}
           }while(opt != 0);
	}
}
