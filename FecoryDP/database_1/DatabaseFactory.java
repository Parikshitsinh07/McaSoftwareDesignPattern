public class DatabaseFactory {
    public static Database getDatabase(int choice) {
        if (choice == 1) {
            return new PostgresConnection();
        } else if (choice == 2) {
            return new MySQLConnection();
		}else if (choice == 3) {
            return new SQLiteConnection();
        } else {
            return null;
        }
    }
}