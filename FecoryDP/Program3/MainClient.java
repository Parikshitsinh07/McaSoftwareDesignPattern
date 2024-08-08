import java.util.Scanner;

public class MainClient{
	public static void  main (String [] args){
		Scanner sc=new Scanner(System.in);
		MyDatabase Database = null ;
	   int opt = 0;
			System.out.println("========================");
			System.out.println("    DATABASE ");
			System.out.println("========================");
			System.out.print("1.Mysql Database\n2.Postgres Database\n0.Exit\n");
			System.out.println("Select Your Database :");
			opt = sc.nextInt();
			Database = DatabaseFactory.getDatabaseFactory(opt);
			if(Database.getMyDatabeseConnection())
			{
				System.out.println("Database Connection Success !!");
			}
			else
			{
				System.out.println("Database Connection Faild !!");
			}
	}
}