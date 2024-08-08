import java.sql.Connection;
import java.util.Scanner;

public class DatabaseConnectionMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. PostgreSQL ");
        System.out.println("2. MySQL ");
		System.out.println("3. SQLlite ");

        System.out.println("Enter choice");
        int ch = sc.nextInt();

        Database databasecon = DatabaseFactory.getDatabase(ch);
        Connection dbConnection = databasecon.getConnect();

        if (dbConnection != null) {
            System.out.println("Connection Success");
        } else {
            System.out.println("Connection Failed");
        }
    }
}