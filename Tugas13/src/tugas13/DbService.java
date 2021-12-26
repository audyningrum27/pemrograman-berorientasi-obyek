package tugas13;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author audy
 */
public class DbService {
    private static Connection connection;
    private static Statement statement;
    private static final Dotenv env = Dotenv.load();

    
    public static ResultSet get(String query) {
        try {
            openConnection();

            ResultSet resultSet = statement.executeQuery(query);
                    
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static boolean query(String query) {
        try {
            openConnection();
            
            return statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public static void openConnection() {
        try {
            String dbHost = env.get("DB_HOST");
            String dbPort = env.get("DB_PORT");
            String dbName = env.get("DB_NAME");
            String dbUser = env.get("DB_USER");
            String dbPass = env.get("DB_PASS");

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName+"",
                dbUser, 
                dbPass
            );
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void closeConnection() {
        try {
            connection.close();
            statement.close();   
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
